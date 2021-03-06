import { Component, OnInit } from '@angular/core';
import { VoetbalAtleetService } from 'src/app/services/voetbal/voetbal-atleet/voetbal-atleet.service';
import { VoetbalAtleet } from 'src/app/models/voetbal/voetbal-atleet/voetbal-atleet.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-voetbal',
  templateUrl: './voetbal.component.html',
  styleUrls: ['./voetbal.component.scss']
})
export class VoetbalComponent implements OnInit {

  constructor(private _voetbalAtleetService: VoetbalAtleetService, private router: Router)
   {
      this.getAtleten();
   }

    atleten: VoetbalAtleet[];
    atletenAfbeeldingen = [];



  getAtleten(){
    this._voetbalAtleetService.getAtleten().subscribe(result =>{
      this.atleten = result;

      var count = 0;
      for (var atleet of this.atleten){
        if (count <= 3){
          this.atletenAfbeeldingen.push((atleet.naam.split(" ")[0] + ".jpg"));
        } else {
          this.atletenAfbeeldingen.push("noImage.jpg");
        }
          count++;
      }
    });
  }
  voetbalAtleetBeheren() {
    this.router.navigate(['voetbalAtleetBeheren']);
  }



  ngOnInit() {
  }

}
