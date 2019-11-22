import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AthleetComponent } from './athleet/athleet.component';
import { LandComponent } from './land/land.component';
import { CategorieComponent } from './categorie/categorie.component';
import { BadmintonComponent } from './badminton/badminton.component';



@NgModule({
  declarations: [AthleetComponent, LandComponent, CategorieComponent, BadmintonComponent],
  imports: [
    CommonModule
  ]
})
export class BadmintonModule { }
