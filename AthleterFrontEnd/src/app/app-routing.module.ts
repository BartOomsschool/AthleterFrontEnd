import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VoetbalComponent } from './views/voetbal/voetbal/voetbal.component';
<<<<<<< HEAD
import { VoetbalAtleetToevoegenComponent } from './views/voetbal/voetbalatleet-toevoegen/voetbalatleet-toevoegen/voetbalatleet-toevoegen.component';
import { BadmintonComponent } from './views/badminton/badminton/badminton.component';


=======
import { BadmintonComponent } from './views/badminton/badminton/badminton.component';

import { SpelerToevoegenComponent } from './views/voetbal/speler-toevoegen/speler-toevoegen/speler-toevoegen.component';
import { VoetbalTeamToevoegenComponent } from './views/voetbal/voetbal-team-toevoegen/voetbal-team-toevoegen/voetbal-team-toevoegen.component';
import { VoetbalPositieToevoegenComponent } from './views/voetbal/voetbal-positie-toevoegen/voetbal-positie-toevoegen/voetbal-positie-toevoegen.component';

>>>>>>> 859e5e415ebf31eb18b26d0c776bc61fee204d86


const appRoutes: Routes = [
  { path: 'voetbal', component: VoetbalComponent },
<<<<<<< HEAD
  { path: 'voetbalAtleetToevoegen', component: VoetbalAtleetToevoegenComponent },
  { path: 'Badminton', component: BadmintonComponent },
=======
  { path: 'spelerToevoegen', component: SpelerToevoegenComponent },

  { path: 'badminton', component: BadmintonComponent },
  
  { path: 'voetbalTeamToevoegen', component: VoetbalTeamToevoegenComponent },
  { path: 'voetbalPositieToevoegen', component: VoetbalPositieToevoegenComponent },
>>>>>>> 859e5e415ebf31eb18b26d0c776bc61fee204d86

];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes, { enableTracing: false })],
  exports: [RouterModule]
})

export class AppRoutingModule { }
