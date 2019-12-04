import { NgModule } from '@angular/core';
import { VoetbalatleetBeherenComponent } from './voetbalatleet-beheren/voetbalatleet-beheren.component';
import { SharedModule } from 'src/app/shared/shared.module';



@NgModule({
  declarations: [VoetbalatleetBeherenComponent],
  imports: [
    SharedModule
  ]
})
export class VoetbalatleetBeherenModule { }
