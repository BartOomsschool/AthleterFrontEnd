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
import { HockeyComponent } from './views/hockey/hockey/hockey.component';
import { HockeyatleetToevoegenComponent } from './views/hockey/hockeyatleet-toevoegen/hockeyatleet-toevoegen.component';
import { HockeyatleetUpdatenComponent } from './views/hockey/hockeyatleet-updaten/hockeyatleet-updaten.component';
import { HockeyatleetBeherenComponent } from './views/hockey/hockeyatleet-beheren/hockeyatleet-beheren.component';
import { VoetbalatleetBeherenComponent } from './views/voetbal/voetbalatleet-beheren/voetbalatleet-beheren/voetbalatleet-beheren.component';
import { HomeModule } from './views/home/home.module';
import { VolleybalatleetBeherenComponent } from './views/volleybal/volleybalatleet-beheren/volleybalatleet-beheren/volleybalatleet-beheren.component';

@NgModule({
  declarations: [
    AppComponent,
    VoetbalComponent,
    VolleybalComponent,
    HockeyComponent,
    HockeyatleetToevoegenComponent,
    HockeyatleetUpdatenComponent,
    HockeyatleetBeherenComponent,
    VoetbalatleetBeherenComponent,
    VolleybalatleetBeherenComponent
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
