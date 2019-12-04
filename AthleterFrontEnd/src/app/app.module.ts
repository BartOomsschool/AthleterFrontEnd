import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SharedModule } from './shared/shared.module';
import { HttpClientModule } from '@angular/common/http';
import { VoetbalComponent } from './views/voetbal/voetbal/voetbal.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { BadmintonModule } from './views/badminton/badminton.module';
import { VolleybalComponent } from './views/volleybal/volleybal/volleybal.component';
import { VolleybalatleetToevoegenComponent } from './views/volleybal/volleybalatleet-toevoegen/volleybalatleet-toevoegen/volleybalatleet-toevoegen.component';
import { VolleybalatleetUpdatenComponent } from './views/volleybal/volleybalatleet-updaten/volleybalatleet-updaten/volleybalatleet-updaten.component';
import { HockeyComponent } from './views/hockey/hockey/hockey.component';
import { HockeyModule } from './views/hockey/hockey.module';
import { HockeyatleetToevoegenComponent } from './views/hockey/hockeyatleet-toevoegen/hockeyatleet-toevoegen.component';
import { HockeyatleetUpdatenComponent } from './views/hockey/hockeyatleet-updaten/hockeyatleet-updaten.component';
import { VoetbalatleetBeherenComponent } from './views/voetbal/voetbalatleet-beheren/voetbalatleet-beheren/voetbalatleet-beheren.component';
import { HomeModule } from './views/home/home.module';

@NgModule({
  declarations: [
    AppComponent,
    VoetbalComponent,
    VolleybalComponent,
    VolleybalatleetToevoegenComponent,
    VolleybalatleetUpdatenComponent,
    HockeyComponent,
    HockeyatleetToevoegenComponent,
    HockeyatleetUpdatenComponent,
    VoetbalatleetBeherenComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    SharedModule,
    HttpClientModule,
    BrowserAnimationsModule,
    BadmintonModule,
    HomeModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
