import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SpelerToevoegenComponent } from './speler-toevoegen/speler-toevoegen.component';
import { SharedModule } from 'src/app/shared/shared.module';



@NgModule({
  declarations: [SpelerToevoegenComponent],
  imports: [
    SharedModule
  ]
})
export class SpelerToevoegenModule { }
