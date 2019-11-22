import { Component, OnInit } from '@angular/core';
import { AthleetService } from 'src/app/services/badminton/athleet/athleet.service';
import { Router } from '@angular/router';
import { Athleet } from 'src/app/models/badminton/athleet/athleet.model';

@Component({
  selector: 'app-badminton',
  templateUrl: './badminton.component.html',
  styleUrls: ['./badminton.component.scss']
})
export class BadmintonComponent implements OnInit {

  athleten: Athleet[];

  constructor(private _athleetService: AthleetService , private router: Router) {
    this.getAthleten();
  }

  getAthleten(){
    this._athleetService.getAthleten().subscribe(result =>{
      this.athleten = result;
    });
  }

  naarHome() {
    this.router.navigate(['/']);
  }

  ngOnInit() {
  }

}
