import { NgModule } from '@angular/core';
import { VoetbalComponent } from './voetbal/voetbal.component';
import { SharedModule } from 'src/app/shared/shared.module';
import { PositieToevoegenComponent } from './positie/positie-toevoegen/positie-toevoegen.component';



@NgModule({
  declarations: [VoetbalComponent, PositieToevoegenComponent],
  imports: [
    SharedModule
  ]
})
export class VoetbalModule { }
