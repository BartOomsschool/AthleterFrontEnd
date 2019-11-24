import { Component, OnInit } from '@angular/core';
import { SpelerService } from 'src/app/services/voetbal/speler/speler.service';
import { Speler } from 'src/app/models/voetbal/speler/speler.model';
import { Router } from '@angular/router';
import { VoetbalTeam } from 'src/app/models/voetbal/voetbal-team/voetbal-team.model';
import { VoetbalTeamService } from 'src/app/services/voetbal/voetbal-team/voetbal-team.model';
import { VoetbalPositieService } from 'src/app/services/voetbal/voetbal-positie/voetbal-positie.model';
import { VoetbalPositie } from 'src/app/models/voetbal/voetbal-positie/voetbal-positie.model';

@Component({
  selector: 'app-voetbal',
  templateUrl: './voetbal.component.html',
  styleUrls: ['./voetbal.component.scss']
})
export class VoetbalComponent implements OnInit {

  constructor(private _spelerService: SpelerService, private router: Router, private _voetbalTeamService: VoetbalTeamService, private _voetbalPositieService: VoetbalPositieService)
   {

   }

    spelers: Speler[];
    teams: VoetbalTeam[];
    posities: VoetbalPositie[];


  getSpelers(){
    this._spelerService.getSpelers().subscribe(result =>{
      this.spelers = result;
      console.log('Spelers: ', result);
    });
  }

  getTeams(){
    this._voetbalTeamService.getTeams().subscribe(result => {
      this.teams = result;
      console.log('Teams: ', result);
    });
  }

  getPosities(){
    this._voetbalPositieService.getPosities().subscribe(result => {
      this.posities = result;
      console.log('Posities: ', result);
    });
  }

  naarSpelerToevoegen() {
    this.router.navigate(['spelerToevoegen']);
  }

  naarVoetbalTeamToevoegen(){
    this.router.navigate(['voetbalTeamToevoegen']);
  }

  naarVoetbalPositieToevoegen(){
    this.router.navigate(['voetbalPositieToevoegen']);
  }

  naarHome() {
    this.router.navigate(['/']);

  }


  ngOnInit() {
  }

}
