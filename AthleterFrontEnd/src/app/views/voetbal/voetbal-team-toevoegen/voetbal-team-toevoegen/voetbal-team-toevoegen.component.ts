import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { VoetbalTeamService } from 'src/app/services/voetbal/voetbal-team/voetbal-team.model';

@Component({
  selector: 'app-voetbal-team-toevoegen',
  templateUrl: './voetbal-team-toevoegen.component.html',
  styleUrls: ['./voetbal-team-toevoegen.component.scss']
})
export class VoetbalTeamToevoegenComponent implements OnInit {

  submitted: boolean = false;

  constructor(private fb: FormBuilder, private _voetbalTeamService: VoetbalTeamService) { }

  voetbalTeamToevoegenForm = this.fb.group({
    teamNaam: ['', Validators.required]
    });

    onSubmitVoetbalPositie() {
      this.submitted = true;
      this._voetbalTeamService.addTeam(this.voetbalTeamToevoegenForm.value).subscribe(result => {
        console.log('toegevoegd: ', result);
      });
    }

  ngOnInit() {
  }

}
