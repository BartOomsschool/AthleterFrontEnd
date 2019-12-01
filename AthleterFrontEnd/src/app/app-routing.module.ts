import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VoetbalComponent } from './views/voetbal/voetbal/voetbal.component';
import { VoetbalAtleetToevoegenComponent } from './views/voetbal/voetbalatleet-toevoegen/voetbalatleet-toevoegen/voetbalatleet-toevoegen.component';
import { BadmintonComponent } from './views/badminton/badminton/badminton.component';
import { VoetbalatleetUpdatenComponent } from './views/voetbal/voetbalatleet-updaten/voetbalatleet-updaten/voetbalatleet-updaten.component';
import { VolleybalatleetToevoegenComponent } from './views/volleybal/volleybalatleet-toevoegen/volleybalatleet-toevoegen/volleybalatleet-toevoegen.component';
import { VolleybalatleetUpdatenComponent } from './views/volleybal/volleybalatleet-updaten/volleybalatleet-updaten/volleybalatleet-updaten.component';
import { VolleybalComponent } from './views/volleybal/volleybal/volleybal.component';

const appRoutes: Routes = [
  { path: 'voetbal', component: VoetbalComponent },
  { path: 'voetbalAtleetToevoegen', component: VoetbalAtleetToevoegenComponent },
  { path: 'voetbalAtleetUpdaten/:id', component: VoetbalatleetUpdatenComponent },
  { path: 'badminton', component: BadmintonComponent },

  { path: 'volleybal', component: VolleybalComponent },
  { path: 'volleybalAtleetToevoegen', component: VolleybalatleetToevoegenComponent },
  { path: 'volleybalAtleetUpdaten/:id', component: VolleybalatleetUpdatenComponent }
  

];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes, { enableTracing: false })],
  exports: [RouterModule]
})

export class AppRoutingModule { }
