import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SharedModule } from './shared/shared.module';
import { HttpClientModule } from '@angular/common/http';
import { VoetbalComponent } from './views/voetbal/voetbal/voetbal.component';
import { VoetbalAtleetToevoegenComponent } from './views/voetbal/voetbalatleet-toevoegen/voetbalatleet-toevoegen/voetbalatleet-toevoegen.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
<<<<<<< HEAD
import { BadmintonComponent } from './views/badminton/badminton/badminton.component';

=======
import { VoetbalTeamToevoegenComponent } from './views/voetbal/voetbal-team-toevoegen/voetbal-team-toevoegen/voetbal-team-toevoegen.component';
import { VoetbalPositieToevoegenComponent } from './views/voetbal/voetbal-positie-toevoegen/voetbal-positie-toevoegen/voetbal-positie-toevoegen.component';
import { BadmintonModule } from './views/badminton/badminton.module';
>>>>>>> 859e5e415ebf31eb18b26d0c776bc61fee204d86

@NgModule({
  declarations: [
    AppComponent,
    VoetbalComponent,
<<<<<<< HEAD
    VoetbalAtleetToevoegenComponent,
    BadmintonComponent,
=======
    SpelerToevoegenComponent,
    VoetbalTeamToevoegenComponent,
    VoetbalPositieToevoegenComponent
>>>>>>> 859e5e415ebf31eb18b26d0c776bc61fee204d86
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
