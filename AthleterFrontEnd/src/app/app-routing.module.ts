import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VoetbalComponent } from './views/voetbal/voetbal/voetbal.component';
import { BadmintonComponent } from './views/badminton/badminton/badminton.component';
import { VolleybalatleetToevoegenComponent } from './views/volleybal/volleybalatleet-toevoegen/volleybalatleet-toevoegen/volleybalatleet-toevoegen.component';
import { VolleybalatleetUpdatenComponent } from './views/volleybal/volleybalatleet-updaten/volleybalatleet-updaten/volleybalatleet-updaten.component';
import { VolleybalComponent } from './views/volleybal/volleybal/volleybal.component';
import { HockeyComponent } from './views/hockey/hockey/hockey.component';
import { HockeyatleetToevoegenComponent } from './views/hockey/hockeyatleet-toevoegen/hockeyatleet-toevoegen.component';
import { HockeyatleetUpdatenComponent } from './views/hockey/hockeyatleet-updaten/hockeyatleet-updaten.component';
import { BadmintonBeherenComponent } from './views/badminton/beheren/badminton-beheren.component';
import { HockeyatleetBeherenComponent } from './views/hockey/hockeyatleet-beheren/hockeyatleet-beheren.component';
import { VoetbalatleetBeherenComponent } from './views/voetbal/voetbalatleet-beheren/voetbalatleet-beheren/voetbalatleet-beheren.component';
import { HomeComponent } from './views/home/home/home.component';

const appRoutes: Routes = [
  { path: 'voetbal', component: VoetbalComponent },
  { path: 'badminton', component: BadmintonComponent },
  { path: 'badmintonBeheren', component: BadmintonBeherenComponent },
  { path: 'volleybal', component: VolleybalComponent },
  { path: 'volleybalAtleetToevoegen', component: VolleybalatleetToevoegenComponent },
  { path: 'volleybalAtleetUpdaten/:id', component: VolleybalatleetUpdatenComponent },
  { path: 'hockey', component: HockeyComponent},
  { path: 'hockeyAtleetToevoegen', component: HockeyatleetToevoegenComponent},
  { path: 'hockeyAtleetUpdaten/:id', component: HockeyatleetUpdatenComponent},
  { path: 'hockeyBeheren', component: HockeyatleetBeherenComponent},
  { path: 'voetbalAtleetBeheren', component: VoetbalatleetBeherenComponent},
  { path: 'home', component: HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes, { enableTracing: false })],
  exports: [RouterModule]
})

export class AppRoutingModule { }
