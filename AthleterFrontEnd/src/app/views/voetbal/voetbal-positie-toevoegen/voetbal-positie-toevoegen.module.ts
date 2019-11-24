import { NgModule } from '@angular/core';
import { VoetbalPositieToevoegenComponent } from './voetbal-positie-toevoegen/voetbal-positie-toevoegen.component';
import { SharedModule } from 'src/app/shared/shared.module';



@NgModule({
  declarations: [VoetbalPositieToevoegenComponent],
  imports: [
    SharedModule
  ]
})
export class VoetbalPositieToevoegenModule { }
