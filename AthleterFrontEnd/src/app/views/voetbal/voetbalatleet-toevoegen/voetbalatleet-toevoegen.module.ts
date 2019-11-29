import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { VoetbalAtleetToevoegenComponent } from './voetbalatleet-toevoegen/voetbalatleet-toevoegen.component';
import { SharedModule } from 'src/app/shared/shared.module';



@NgModule({
  declarations: [VoetbalAtleetToevoegenComponent],
  imports: [
    SharedModule
  ]
})
export class AtleetToevoegenModule { }
