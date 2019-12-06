import { Component, OnInit } from '@angular/core';
import { HockeyAtleet } from 'src/app/models/hockey/hockey-atleet/hockey-atleet.model';
import { HockeyAtleetService } from 'src/app/services/hockey/hockey-atleet/hockey-atleet.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-hockey',
  templateUrl: './hockey.component.html',
  styleUrls: ['./hockey.component.scss']
})
export class HockeyComponent implements OnInit {

  atleten: HockeyAtleet[];
  atletenAfbeeldingen = [];

  constructor(private _hockeyService: HockeyAtleetService, private router: Router) { }

  ngOnInit() { 
    this.getAtleten();
  }

  getAtleten(){
    this._hockeyService.getHockeyAtleten().subscribe(result => {
      this.atleten = result;

      var count = 0;
      for (var atleet of this.atleten){
        if (count <= 7){
          this.atletenAfbeeldingen.push((atleet.naam.split(" ")[0] + ".jpg"));
        } else {
          this.atletenAfbeeldingen.push("noImage.jpg");
        }
          count++;
      }
    })
  }

  naarHockeyAtleetToevoegen(){
    this.router.navigate(['hockeyAtleetToevoegen']);
  }

  deleteHockeyAtleet(a: string){
    console.log(a);
    this._hockeyService.deleteHockeyAtleet(a).subscribe(() => {
      this.getAtleten();
    });
  }

  updateHockeyAtleet(a: string){
    this.router.navigate(['hockeyAtleetUpdaten' , a]);
  }

}
