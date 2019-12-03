import { Component, OnInit } from '@angular/core';
import { BadmintonAtleetService } from 'src/app/services/badminton/badminton-atleet/badminton-atleet.service';
import { Router } from '@angular/router';
import { BadmintonAtleet } from 'src/app/models/badminton/badminton-atleet/badminton-atleet.model';

@Component({
  selector: 'app-badminton-beheren',
  templateUrl: './badminton-beheren.component.html',
  styleUrls: ['./badminton-beheren.component.scss']
})
export class BadmintonBeherenComponent implements OnInit {
  atleten: BadmintonAtleet[];
  popup: boolean = false;
  submitted: boolean = true;

  atleet: BadmintonAtleet = new BadmintonAtleet(0, '', 0, '', '', 0, 0, 'noImage.jpg', null)

  constructor(private _badmintonAtleetService: BadmintonAtleetService , private router: Router) {
    this.getAtleten();
   }

   getAtleten(){
     this._badmintonAtleetService.getBadmintonAtleten().subscribe(result =>{
       this.atleten = result;
     });
   }

   toevoegenPopup(){
     this.popup = true;
     this.atleet = new BadmintonAtleet(0, '', 0, '', '', 0, 0, 'noImage.jpg', null)
   }

   closePopup(){
     this.popup = false;
   }

   onSubmit(){
      if (this.atleet.atleetID == 0){
        console.log("post")
        this._badmintonAtleetService.addBadmintonAtleet(this.atleet).subscribe(result =>{
          this.popup = false;
          this.getAtleten();
        });
      } else {
        console.log("put")
        this._badmintonAtleetService.updateBadmintonAtleet(this.atleet).subscribe(result =>{
          this.popup = false;
          this.getAtleten();
        });
      }
   }

   deleteAtleet(id: number){
    this._badmintonAtleetService.deleteBadmintonAtleet(id).subscribe(result =>{
      this.getAtleten();
    });
   }

   updateAtleet(atleet: BadmintonAtleet){
     this.atleet = atleet;
     console.log(this.atleet);
     this.popup = true;
   }


  ngOnInit() {
  }

}
