import { NgModule } from '@angular/core';

import { VoetbalatleetUpdatenComponent } from './voetbalatleet-updaten/voetbalatleet-updaten.component';
import { SharedModule } from 'src/app/shared/shared.module';



@NgModule({
  declarations: [VoetbalatleetUpdatenComponent],
  imports: [
    SharedModule
  ]
})
export class VoetbalatleetUpdatenModule { }
