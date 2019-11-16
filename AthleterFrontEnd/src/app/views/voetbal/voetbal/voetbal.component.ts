import { Component, OnInit } from '@angular/core';
import { SpelerService } from 'src/app/services/voetbal/speler.service';
import { Speler } from 'src/app/models/voetbal/speler.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-voetbal',
  templateUrl: './voetbal.component.html',
  styleUrls: ['./voetbal.component.scss']
})
export class VoetbalComponent implements OnInit {

  constructor(private _spelerService: SpelerService , private router : Router)
   {
      this.getSpelers();
   }

    spelers : Speler[];


  getSpelers(){
    this._spelerService.getSpelers().subscribe(result =>{
      this.spelers = result;
    });
  }

  naarHome() {
    this.router.navigate(['/']);

  }


  ngOnInit() {
  }

}
