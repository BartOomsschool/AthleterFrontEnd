import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BadmintonComponent } from './badminton/badminton.component';
import { BadmintonBeherenComponent } from './beheren/badminton-beheren.component';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [BadmintonBeherenComponent, BadmintonComponent, BadmintonBeherenComponent],
  imports: [
    CommonModule,
    RouterModule,
    FormsModule
  ]
})
export class BadmintonModule { }
