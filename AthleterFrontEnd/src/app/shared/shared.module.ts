import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatFormFieldModule, MatInputModule, MatButtonModule, MatSidenavModule, MatListModule  } from '@angular/material'; 
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';



@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    MatFormFieldModule,
    MatButtonModule,
    MatInputModule,
    FormsModule,
    MatSidenavModule,
    MatListModule,
    ReactiveFormsModule,
    BrowserModule
  ],
  exports: [
    CommonModule,
    MatFormFieldModule,
    MatButtonModule,
    MatInputModule,
    FormsModule,
    MatSidenavModule,
    MatListModule,
    ReactiveFormsModule,
    BrowserModule
  ]
})
export class SharedModule { }
