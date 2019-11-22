import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder } from '@angular/forms';
import { SpelerService } from 'src/app/services/voetbal/speler/speler.service';

@Component({
  selector: 'app-speler-toevoegen',
  templateUrl: './speler-toevoegen.component.html',
  styleUrls: ['./speler-toevoegen.component.scss'],
  providers: [SpelerService]
})
export class SpelerToevoegenComponent implements OnInit {

  submitted: boolean = false;

  constructor(private fb: FormBuilder, private _spelerService: SpelerService) { }

  spelerToevoegenForm = this.fb.group({
    Naam: ['', Validators.required],
    teamID: ['', Validators.required],
    positieID: ['', Validators.required],
    Geboortedatum:['', Validators.required]
    });

    
    onSubmitSpeler() {
      this.submitted = true;
      this._spelerService.addSpeler(this.spelerToevoegenForm.value).subscribe();
    }

  ngOnInit() {
  }

}
