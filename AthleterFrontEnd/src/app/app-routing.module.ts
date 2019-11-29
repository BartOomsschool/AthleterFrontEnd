import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VoetbalComponent } from './views/voetbal/voetbal/voetbal.component';
<<<<<<< HEAD
import { SpelerToevoegenComponent } from './views/voetbal/speler/speler-toevoegen/speler-toevoegen/speler-toevoegen.component';
import { BadmintonComponent } from './views/badminton/badminton/badminton.component';
=======
import { SpelerToevoegenComponent } from './views/voetbal/speler-toevoegen/speler-toevoegen/speler-toevoegen.component';
import { VoetbalTeamToevoegenComponent } from './views/voetbal/voetbal-team-toevoegen/voetbal-team-toevoegen/voetbal-team-toevoegen.component';
import { VoetbalPositieToevoegenComponent } from './views/voetbal/voetbal-positie-toevoegen/voetbal-positie-toevoegen/voetbal-positie-toevoegen.component';

>>>>>>> e378ba885fd2cd7251ce4d86c8ca2d6060461a22



const appRoutes: Routes = [
  { path: 'voetbal', component: VoetbalComponent },
  { path: 'spelerToevoegen', component: SpelerToevoegenComponent },
<<<<<<< HEAD
  { path: 'Badminton', component: BadmintonComponent }
=======
  { path: 'voetbalTeamToevoegen', component: VoetbalTeamToevoegenComponent },
  { path: 'voetbalPositieToevoegen', component: VoetbalPositieToevoegenComponent },


>>>>>>> e378ba885fd2cd7251ce4d86c8ca2d6060461a22
];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes, { enableTracing: false })],
  exports: [RouterModule]
})

export class AppRoutingModule { }
