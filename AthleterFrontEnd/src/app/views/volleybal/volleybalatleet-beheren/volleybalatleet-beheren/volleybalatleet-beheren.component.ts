import { Component, OnInit } from '@angular/core';
import { VolleybalAtleetService } from 'src/app/services/volleybal/volleybal-atleet/volleybal-atleet.service';
import { VolleybalAtleet } from 'src/app/models/volleybal/volleybal-atleet/volleybal-atleet.model';

@Component({
  selector: 'app-volleybalatleet-beheren',
  templateUrl: './volleybalatleet-beheren.component.html',
  styleUrls: ['./volleybalatleet-beheren.component.scss']
})
export class VolleybalatleetBeherenComponent implements OnInit {

  constructor(private _volleybalAtleetService: VolleybalAtleetService)
  {
    this.getAtleten();
   }

  atleten: VolleybalAtleet[];
  atleet: VolleybalAtleet;
  popup: boolean = false;


  getAtleten(){
    this._volleybalAtleetService.getAtleten().subscribe(result =>{
      this.atleten = result;
      console.log('Atleten: ', result);
    });
  }

  deleteAtleet(id: string){
    this._volleybalAtleetService.deleteAtleet(id).subscribe(result =>{
      this.getAtleten();
    });
   }

   updateAtleet(atleet: VolleybalAtleet){
     this.atleet = atleet;
     console.log(this.atleet);
     this.popup = true;
   }

   closePopup(){
    this.popup = false;
  }

  onSubmit(){
    if (this.atleet.volleyballid == ''){
      console.log("post:", this.atleet);
      this._volleybalAtleetService.addAtleet(this.atleet).subscribe(result =>{
        this.popup = false;
        this.getAtleten();
      });
    } else {
      console.log("put: ");
      this._volleybalAtleetService.updateAtleet(this.atleet).subscribe(result =>{
        this.popup = false;
        this.getAtleten();
      });
    }
 }

  toevoegenPopup(){
    this.popup = true;
    this.atleet = new VolleybalAtleet('', '', '','', '','');
  }


  ngOnInit() {
  }

}
