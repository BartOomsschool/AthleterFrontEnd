import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormControl } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { HockeyAtleetService } from 'src/app/services/hockey/hockey-atleet/hockey-atleet.service';

@Component({
  selector: 'app-hockeyatleet-updaten',
  templateUrl: './hockeyatleet-updaten.component.html',
  styleUrls: ['./hockeyatleet-updaten.component.scss']
})
export class HockeyatleetUpdatenComponent implements OnInit {

  ID: string;
  naam: string;
  positie: string;
  ploeg: string;

  hockeyAtleetUpdatenForm = this.fb.group({
    naam: ['', Validators.required],
    ploeg: ['', Validators.required],
    positie: ['', Validators.required]
    });


  constructor(private route: ActivatedRoute, private _hockeyService: HockeyAtleetService, private fb: FormBuilder, private router: Router) {}

  ngOnInit() {
    this.route.paramMap.subscribe(Params => {
      this.ID = Params.get('id');
      this.getHockeyAtleet(this.ID);
    });
  }

  getHockeyAtleet(id: string){
    this._hockeyService.getHockeyAtleet(id).subscribe(result => {
        this.naam = result.naam;
        this.positie = result.positie;
        this.ploeg = result.ploeg;
    });
  }

  onSubmitUpdateAtleet() {
    this.hockeyAtleetUpdatenForm.addControl('id', new FormControl(this.ID));
    console.log(this.hockeyAtleetUpdatenForm.value);
    this._hockeyService.updateHockeyAtleet(this.hockeyAtleetUpdatenForm.value).subscribe(result => {
      this.router.navigate(['hockey']);
    });
  }
}
