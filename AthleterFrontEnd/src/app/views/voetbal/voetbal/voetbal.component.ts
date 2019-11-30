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

    atleten: VoetbalAtleet[];



  getAtleten(){
    this._voetbalAtleetService.getAtleten().subscribe(result =>{
      this.atleten = result;
      console.log('Atleten: ', result);
    });
  }
  naarAtleetToevoegen() {
    this.router.navigate(['voetbalAtleetToevoegen']);
  }

  deleteAtleet(id: number){
    this._voetbalAtleetService.deleteAtleet(id).subscribe(result =>{
      console.log('deleted atleet:', result);
      this.getAtleten();
    });
  }

  updateAtleet(atleetID: string){
    this.router.navigate(['voetbalAtleetUpdaten' , atleetID]);
  }


  naarHome() {
    this.router.navigate(['/']);
    }


  ngOnInit() {
  }

}
