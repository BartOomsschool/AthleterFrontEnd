import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { VoetbalPositieService } from 'src/app/services/voetbal/voetbal-positie/voetbal-positie.model';

@Component({
  selector: 'app-voetbal-positie-toevoegen',
  templateUrl: './voetbal-positie-toevoegen.component.html',
  styleUrls: ['./voetbal-positie-toevoegen.component.scss']
})
export class VoetbalPositieToevoegenComponent implements OnInit {

  submitted: boolean = false;

  constructor(private fb: FormBuilder, private _voetbalPosisitieService: VoetbalPositieService) { }

  voetbalPositieToevoegenForm = this.fb.group({
    Number: ['', Validators.required]
    });

    onSubmitVoetbalPositie() {
      this.submitted = true;
      this._voetbalPosisitieService.addPositie(this.voetbalPositieToevoegenForm.value).subscribe(result => {
        console.log('toegevoegd: ', result);
      });
    }

  ngOnInit() {
  }

}
