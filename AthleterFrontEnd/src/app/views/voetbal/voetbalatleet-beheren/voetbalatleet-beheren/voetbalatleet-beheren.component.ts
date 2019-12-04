import { Component, OnInit } from '@angular/core';
import { VoetbalAtleetService } from 'src/app/services/voetbal/voetbal-atleet/voetbal-atleet.service';
import { VoetbalAtleet } from 'src/app/models/voetbal/voetbal-atleet/voetbal-atleet.model';

@Component({
  selector: 'app-voetbalatleet-beheren',
  templateUrl: './voetbalatleet-beheren.component.html',
  styleUrls: ['./voetbalatleet-beheren.component.scss']
})
export class VoetbalatleetBeherenComponent implements OnInit {

  constructor(private _voetbalAtleetService: VoetbalAtleetService) 
  {
    this.getAtleten();
   }

  atleten: VoetbalAtleet[];
  atleet: VoetbalAtleet;
  popup: boolean = false;


  getAtleten(){
    this._voetbalAtleetService.getAtleten().subscribe(result =>{
      this.atleten = result;
      console.log('Atleten: ', result);
    });
  }

  deleteAtleet(id: number){
    this._voetbalAtleetService.deleteAtleet(id).subscribe(result =>{
      this.getAtleten();
    });
   }

   updateAtleet(atleet: VoetbalAtleet){
     this.atleet = atleet;
     console.log(this.atleet);
     this.popup = true;
   }

   closePopup(){
    this.popup = false;
  }

  onSubmit(){
    if (this.atleet.voetbalAtleetID == ''){
      console.log("post:", this.atleet);
      this._voetbalAtleetService.addAtleet(this.atleet).subscribe(result =>{
        this.popup = false;
        this.getAtleten();
      });
    } else {
      console.log("put: ");
      this._voetbalAtleetService.updateAtleet(this.atleet).subscribe(result =>{
        this.popup = false;
        this.getAtleten();
      });
    }
 }

  toevoegenPopup(){
    this.popup = true;
    this.atleet = new VoetbalAtleet('', '', '','');
  }


  ngOnInit() {
  }

}
