import { Component, OnInit } from '@angular/core';
import { HockeyAtleet } from 'src/app/models/hockey/hockey-atleet/hockey-atleet.model';
import { HockeyAtleetService } from 'src/app/services/hockey/hockey-atleet/hockey-atleet.service';

@Component({
  selector: 'app-hockey',
  templateUrl: './hockey.component.html',
  styleUrls: ['./hockey.component.scss']
})
export class HockeyComponent implements OnInit {

  atleten: HockeyAtleet[];

  constructor(private _hockeyService: HockeyAtleetService) { }

  ngOnInit() { 
    this.getAtleten();
  }

  getAtleten(){
    this._hockeyService.getHockeyAtleten().subscribe(result => {
      this.atleten = result;
    })
  }

}
