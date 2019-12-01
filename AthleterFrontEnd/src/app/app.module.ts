import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SharedModule } from './shared/shared.module';
import { HttpClientModule } from '@angular/common/http';
import { VoetbalComponent } from './views/voetbal/voetbal/voetbal.component';
import { VoetbalAtleetToevoegenComponent } from './views/voetbal/voetbalatleet-toevoegen/voetbalatleet-toevoegen/voetbalatleet-toevoegen.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { BadmintonModule } from './views/badminton/badminton.module';
import { VoetbalatleetUpdatenComponent } from './views/voetbal/voetbalatleet-updaten/voetbalatleet-updaten/voetbalatleet-updaten.component';
<<<<<<< HEAD
import { VolleybalComponent } from './views/volleybal/volleybal/volleybal.component';
import { VolleybalatleetToevoegenComponent } from './views/volleybal/volleybalatleet-toevoegen/volleybalatleet-toevoegen/volleybalatleet-toevoegen.component';
import { VolleybalatleetUpdatenComponent } from './views/volleybal/volleybalatleet-updaten/volleybalatleet-updaten/volleybalatleet-updaten.component';

=======
import { HockeyComponent } from './views/hockey/hockey/hockey.component';
>>>>>>> eab2ef6cf2a139cdf7e51b70a0400d42817aa5bb

@NgModule({
  declarations: [
    AppComponent,
    VoetbalComponent,
    VoetbalAtleetToevoegenComponent,
    VoetbalatleetUpdatenComponent,
<<<<<<< HEAD
    VolleybalComponent,
    VolleybalatleetToevoegenComponent,
    VolleybalatleetUpdatenComponent
=======
    HockeyComponent
>>>>>>> eab2ef6cf2a139cdf7e51b70a0400d42817aa5bb
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    SharedModule,
    HttpClientModule,
    BrowserAnimationsModule,
    BadmintonModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
