import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HockeyComponent } from './hockey/hockey.component';
import { SharedModule } from 'src/app/shared/shared.module';
import { HockeyatleetToevoegenComponent } from './hockeyatleet-toevoegen/hockeyatleet-toevoegen.component';
import { HockeyatleetUpdatenComponent } from './hockeyatleet-updaten/hockeyatleet-updaten.component';
import { HockeyatleetBeherenComponent } from './hockeyatleet-beheren/hockeyatleet-beheren.component';



@NgModule({
  declarations: [HockeyComponent, HockeyatleetToevoegenComponent, HockeyatleetUpdatenComponent, HockeyatleetBeherenComponent],
  imports: [
    CommonModule,
    SharedModule
  ]
})
export class HockeyModule { }
