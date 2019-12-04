import { Component, OnInit } from '@angular/core';
import { HockeyAtleet } from 'src/app/models/hockey/hockey-atleet/hockey-atleet.model';
import { HockeyAtleetService } from 'src/app/services/hockey/hockey-atleet/hockey-atleet.service';

@Component({
  selector: 'app-hockeyatleet-beheren',
  templateUrl: './hockeyatleet-beheren.component.html',
  styleUrls: ['./hockeyatleet-beheren.component.scss']
})
export class HockeyatleetBeherenComponent implements OnInit {

  popup: boolean = false;
  atleet: HockeyAtleet = new HockeyAtleet("", "", "", "");
  atleten: HockeyAtleet[];
  constructor(private _hockeyService: HockeyAtleetService) { }

  ngOnInit() {
    this.getAtleten();
  }

  toevoegenPopup(){
    this.popup = true;
    this.atleet = new HockeyAtleet("", "", "", "");
  }

  updateHockeyAtleet(atleet: HockeyAtleet){
    this.atleet = atleet;
    console.log(this.atleet);
    this.popup = true;
  }

  getAtleten(){
    this._hockeyService.getHockeyAtleten().subscribe(result => {
      this.atleten = result;
    })
  }

  onSubmit(){
    if (this.atleet.id == ""){
      this._hockeyService.addHockeyAtleet(this.atleet).subscribe(result =>{
        this.popup = false;
        this.getAtleten();
      });
    } else {
      this._hockeyService.updateHockeyAtleet(this.atleet).subscribe(result =>{
        this.popup = false;
        this.getAtleten();
      });
    }
 }

 deleteHockeyAtleet(a: string){
  this._hockeyService.deleteHockeyAtleet(a).subscribe(() => {
    this.getAtleten();
  });
}

}
