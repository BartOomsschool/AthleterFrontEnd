import { NgModule } from '@angular/core';
import { VoetbalTeamToevoegenComponent } from './voetbal-team-toevoegen/voetbal-team-toevoegen.component';
import { SharedModule } from 'src/app/shared/shared.module';



@NgModule({
  declarations: [VoetbalTeamToevoegenComponent],
  imports: [
    SharedModule
  ]
})
export class VoetbalTeamToevoegenModule { }
