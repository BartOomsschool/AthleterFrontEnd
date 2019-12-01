import { Component, OnInit } from '@angular/core';
import { VolleybalAtleetService } from 'src/app/services/volleybal/volleybal-atleet/volleybal-atleet.service';
import { VolleybalAtleet } from 'src/app/models/volleybal/volleybal-atleet/volleybal-atleet.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-volleybal',
  templateUrl: './volleybal.component.html',
  styleUrls: ['./volleybal.component.scss']
})
export class VolleybalComponent implements OnInit {

  constructor(private _volleybalService: VolleybalAtleetService, private router: Router) { }

  volleybalAtleten: VolleybalAtleet[];

getAtleten(){
  this._volleybalService.getAtleten().subscribe(result => {
    this.volleybalAtleten = result;
  });
}

naarAtleetToevoegen() {
  this.router.navigate(['volleybalAtleetToevoegen']);
}

deleteAtleet(id: number){
  this._volleybalService.deleteAtleet(id).subscribe(result =>{
    console.log('deleted atleet:', result);
    this.getAtleten();
  });
}

updateAtleet(atleetID: string){
  this.router.navigate(['volleybalAtleetUpdaten' , atleetID]);
}

naarHome() {
  this.router.navigate(['/']);
  }


  ngOnInit() {
  }

}
