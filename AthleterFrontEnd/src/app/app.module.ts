import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SharedModule } from './shared/shared.module';
import { HttpClientModule } from '@angular/common/http';
import { VoetbalComponent } from './views/voetbal/voetbal/voetbal.component';
import { SpelerToevoegenComponent } from './views/voetbal/speler/speler-toevoegen/speler-toevoegen/speler-toevoegen.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { BadmintonComponent } from './views/badminton/badminton/badminton.component';

@NgModule({
  declarations: [
    AppComponent,
    VoetbalComponent,
    SpelerToevoegenComponent,
    BadmintonComponent
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
