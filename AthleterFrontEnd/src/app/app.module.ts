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

@NgModule({
  declarations: [
    AppComponent,
    VoetbalComponent,
    VoetbalAtleetToevoegenComponent,
    VoetbalatleetUpdatenComponent
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
