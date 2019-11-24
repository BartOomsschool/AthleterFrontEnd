import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VoetbalComponent } from './views/voetbal/voetbal/voetbal.component';
import { SpelerToevoegenComponent } from './views/voetbal/speler-toevoegen/speler-toevoegen/speler-toevoegen.component';
import { VoetbalTeamToevoegenComponent } from './views/voetbal/voetbal-team-toevoegen/voetbal-team-toevoegen/voetbal-team-toevoegen.component';
import { VoetbalPositieToevoegenComponent } from './views/voetbal/voetbal-positie-toevoegen/voetbal-positie-toevoegen/voetbal-positie-toevoegen.component';




const appRoutes: Routes = [
  { path: 'voetbal', component: VoetbalComponent },
  { path: 'spelerToevoegen', component: SpelerToevoegenComponent },
  { path: 'voetbalTeamToevoegen', component: VoetbalTeamToevoegenComponent },
  { path: 'voetbalPositieToevoegen', component: VoetbalPositieToevoegenComponent },


];


@NgModule({
  imports: [RouterModule.forRoot(appRoutes, { enableTracing: false })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
