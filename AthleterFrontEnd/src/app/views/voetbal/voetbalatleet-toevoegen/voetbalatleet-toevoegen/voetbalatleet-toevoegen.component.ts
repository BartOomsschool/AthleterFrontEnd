import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder } from '@angular/forms';
import { VoetbalAtleetService } from 'src/app/services/voetbal/voetbal-atleet/voetbal-atleet.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-speler-toevoegen',
  templateUrl: './voetbalatleet-toevoegen.component.html',
  styleUrls: ['./voetbalatleet-toevoegen.component.scss'],
  providers: [VoetbalAtleetService]
})
export class VoetbalAtleetToevoegenComponent implements OnInit {

  submitted: boolean = false;

  constructor(private fb: FormBuilder, private _voetbalAtleetService: VoetbalAtleetService, private router: Router) { }

  atleetToevoegenForm = this.fb.group({
    naam: ['', Validators.required],
    team: ['', Validators.required],
    positie: ['', Validators.required]
    });

    onSubmitAtleet() {
      console.log('atleetForm', this.atleetToevoegenForm.value);
      this.submitted = true;
      this._voetbalAtleetService.addAtleet(this.atleetToevoegenForm.value).subscribe(result => {
        console.log('toegevoegd: ', result);
        this.router.navigate(['voetbal']);
      });
    }

    naarVoetbal(){
      this.router.navigate(['voetbal']);
    }

  ngOnInit() {
  }

}
