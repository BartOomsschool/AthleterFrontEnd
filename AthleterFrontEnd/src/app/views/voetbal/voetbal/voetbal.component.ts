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

   }

    spelers: VoetbalAtleet[];



  getAtleten(){
    this._voetbalAtleetService.getAtleten().subscribe(result =>{
      this.spelers = result;
      console.log('Spelers: ', result);
    });
  }
  naarAtletenToevoegen() {
    this.router.navigate(['voetbalAtleetToevoegen']);
  }


  naarHome() {
    this.router.navigate(['/']);
    }


  ngOnInit() {
  }

}
