import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VoetbalComponent } from './views/voetbal/voetbal/voetbal.component';
import { VoetbalAtleetToevoegenComponent } from './views/voetbal/voetbalatleet-toevoegen/voetbalatleet-toevoegen/voetbalatleet-toevoegen.component';
import { BadmintonComponent } from './views/badminton/badminton/badminton.component';
import { VoetbalatleetUpdatenComponent } from './views/voetbal/voetbalatleet-updaten/voetbalatleet-updaten/voetbalatleet-updaten.component';

const appRoutes: Routes = [
  { path: 'voetbal', component: VoetbalComponent },
  { path: 'voetbalAtleetToevoegen', component: VoetbalAtleetToevoegenComponent },
  { path: 'badminton', component: BadmintonComponent },
  { path: 'voetbalAtleetUpdaten/:id', component: VoetbalatleetUpdatenComponent }
  

];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes, { enableTracing: false })],
  exports: [RouterModule]
})

export class AppRoutingModule { }
