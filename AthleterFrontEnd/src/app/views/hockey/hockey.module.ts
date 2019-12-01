import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HockeyComponent } from './hockey/hockey.component';
import { SharedModule } from 'src/app/shared/shared.module';



@NgModule({
  declarations: [HockeyComponent],
  imports: [
    CommonModule,
    SharedModule
  ]
})
export class HockeyModule { }
