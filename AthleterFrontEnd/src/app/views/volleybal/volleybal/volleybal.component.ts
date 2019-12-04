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

volleybalAtleetBeheren() {
  this.router.navigate(['volleybalAtleetBeheren']);
}


  ngOnInit() {
  }

}
