import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VoetbalComponent } from './views/voetbal/voetbal/voetbal.component';
import { VoetbalAtleetToevoegenComponent } from './views/voetbal/voetbalatleet-toevoegen/voetbalatleet-toevoegen/voetbalatleet-toevoegen.component';
import { BadmintonComponent } from './views/badminton/badminton/badminton.component';




const appRoutes: Routes = [
  { path: 'voetbal', component: VoetbalComponent },
  { path: 'voetbalAtleetToevoegen', component: VoetbalAtleetToevoegenComponent },
  { path: 'Badminton', component: BadmintonComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes, { enableTracing: false })],
  exports: [RouterModule]
})

export class AppRoutingModule { }
