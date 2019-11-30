import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { VoetbalAtleetService } from 'src/app/services/voetbal/voetbal-atleet/voetbal-atleet.service';
import { FormBuilder, Validators, FormControl } from '@angular/forms';
import { VoetbalAtleet } from 'src/app/models/voetbal/voetbal-atleet/voetbal-atleet.model';


@Component({
  selector: 'app-voetbalatleet-updaten',
  templateUrl: './voetbalatleet-updaten.component.html',
  styleUrls: ['./voetbalatleet-updaten.component.scss']
})
export class VoetbalatleetUpdatenComponent implements OnInit {

  atleetID: string;
  atleet: VoetbalAtleet = null;
  submitted: boolean = false;

  atleetUpdatenForm = this.fb.group({
    naam: ['', Validators.required],
    team: ['', Validators.required],
    positie: ['', Validators.required]
    });


  constructor(private route: ActivatedRoute, private _voetbalAtleetService: VoetbalAtleetService, private fb: FormBuilder, private router: Router) 
  {  }

  getAtleet(id: string){
    console.log('in functie getAtleet', id);
    this._voetbalAtleetService.getAtleet(id).subscribe(result => {
        this.atleet = result;
        console.log('opgevraagde atleet', result);
    });
  }

  onSubmitUpdateAtleet() {
    this.atleetUpdatenForm.addControl('voetbalAtleetID', new FormControl(this.atleetID));
    console.log('atleetForm', this.atleetUpdatenForm.value);
    this.submitted = true;
    this._voetbalAtleetService.updateAtleet(this.atleetUpdatenForm.value).subscribe(result => {
      console.log('updated: ', result);
      this.router.navigate(['voetbal']);
    });
  }

  ngOnInit() {
    this.route.paramMap.subscribe(Params => {
      this.atleetID = Params.get('id');
      console.log('atleetID',  this.atleetID);
      this.getAtleet(this.atleetID);
    });
  }

}
