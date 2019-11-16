import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VoetbalComponent } from './views/voetbal/voetbal/voetbal.component';
import { SpelerToevoegenComponent } from './views/voetbal/speler-toevoegen/speler-toevoegen/speler-toevoegen.component';




const appRoutes: Routes = [
  { path: 'voetbal', component: VoetbalComponent },
  { path: 'spelerToevoegen', component: SpelerToevoegenComponent },


];


@NgModule({
  imports: [RouterModule.forRoot(appRoutes, { enableTracing: false })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
