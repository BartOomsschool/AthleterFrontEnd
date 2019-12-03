import { Component, OnInit } from '@angular/core';
import { BadmintonAtleetService } from 'src/app/services/badminton/badminton-atleet/badminton-atleet.service';
import { Router } from '@angular/router';
import { BadmintonAtleet } from '../../../models/badminton/badminton-atleet/badminton-atleet.model';

@Component({
  selector: 'app-badminton',
  templateUrl: './badminton.component.html',
  styleUrls: ['./badminton.component.scss']
})
export class BadmintonComponent implements OnInit {

  atleten: BadmintonAtleet[];

  constructor(private _badmintonAtleetService: BadmintonAtleetService , private router: Router) {
    this.getAtleten();
  }

  getAtleten(){
    this._badmintonAtleetService.getBadmintonAtleten().subscribe(result =>{
      this.atleten = result;
    });
  }

  ngOnInit() {
  }

}
