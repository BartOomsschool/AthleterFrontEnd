import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SharedModule } from './shared/shared.module';
import { HttpClientModule } from '@angular/common/http';
import { VoetbalComponent } from './views/voetbal/voetbal/voetbal.component';
import { SpelerToevoegenComponent } from './views/voetbal/speler-toevoegen/speler-toevoegen/speler-toevoegen.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
<<<<<<< HEAD
import { BadmintonComponent } from './views/badminton/badminton/badminton.component';
=======
import { VoetbalTeamToevoegenComponent } from './views/voetbal/voetbal-team-toevoegen/voetbal-team-toevoegen/voetbal-team-toevoegen.component';
import { VoetbalPositieToevoegenComponent } from './views/voetbal/voetbal-positie-toevoegen/voetbal-positie-toevoegen/voetbal-positie-toevoegen.component';
>>>>>>> e378ba885fd2cd7251ce4d86c8ca2d6060461a22

@NgModule({
  declarations: [
    AppComponent,
    VoetbalComponent,
    SpelerToevoegenComponent,
<<<<<<< HEAD
    BadmintonComponent
=======
    VoetbalTeamToevoegenComponent,
    VoetbalPositieToevoegenComponent
>>>>>>> e378ba885fd2cd7251ce4d86c8ca2d6060461a22
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    SharedModule,
    HttpClientModule,
    BrowserAnimationsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
