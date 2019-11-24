import { NgModule } from '@angular/core';
import { VoetbalComponent } from './voetbal/voetbal.component';
import { SharedModule } from 'src/app/shared/shared.module';



@NgModule({
  declarations: [VoetbalComponent],
  imports: [
    SharedModule
  ]
})
export class VoetbalModule { }
