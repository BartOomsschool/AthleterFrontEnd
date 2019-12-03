import { Component, OnInit } from '@angular/core';
import { HockeyAtleetService } from 'src/app/services/hockey/hockey-atleet/hockey-atleet.service';
import { Router } from '@angular/router';
import { FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-hockeyatleet-toevoegen',
  templateUrl: './hockeyatleet-toevoegen.component.html',
  styleUrls: ['./hockeyatleet-toevoegen.component.scss']
})
export class HockeyatleetToevoegenComponent implements OnInit {

  constructor(private _hockeyService: HockeyAtleetService, private router: Router, private fb: FormBuilder) { }
  hockeyAtleetToevoegenForm = this.fb.group({
    naam: ['', Validators.required],
    ploeg: ['', Validators.required],
    positie: ['', Validators.required]
    });

    onSubmitHockeyAtleet() {
      this._hockeyService.addHockeyAtleet(this.hockeyAtleetToevoegenForm.value).subscribe(() => {
        this.router.navigate(['hockey']);
      });
    }

    naarHockey(){
      this.router.navigate(['hockey']);
    }

  ngOnInit() {
  }

}
