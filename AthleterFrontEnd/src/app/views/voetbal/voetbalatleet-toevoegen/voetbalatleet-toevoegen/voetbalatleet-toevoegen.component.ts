import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder } from '@angular/forms';
import { VoetbalAtleetService } from 'src/app/services/voetbal/voetbal-atleet/voetbal-atleet.service';

@Component({
  selector: 'app-speler-toevoegen',
  templateUrl: './speler-toevoegen.component.html',
  styleUrls: ['./speler-toevoegen.component.scss'],
  providers: [VoetbalAtleetService]
})
export class VoetbalAtleetToevoegenComponent implements OnInit {

  submitted: boolean = false;

  constructor(private fb: FormBuilder, private _voetbalAtleetService: VoetbalAtleetService) { }

  spelerToevoegenForm = this.fb.group({
    Naam: ['', Validators.required],
    teamID: ['', Validators.required],
    positieID: ['', Validators.required],
    Geboortedatum:['', Validators.required]
    });

    onSubmitSpeler() {
      console.log('spelerForm', this.spelerToevoegenForm.value);
      this.submitted = true;
      this._voetbalAtleetService.addAtleet(this.spelerToevoegenForm.value).subscribe(result => {
        console.log('toegevoegd: ', result);
      });
    }

  ngOnInit() {
  }

}
