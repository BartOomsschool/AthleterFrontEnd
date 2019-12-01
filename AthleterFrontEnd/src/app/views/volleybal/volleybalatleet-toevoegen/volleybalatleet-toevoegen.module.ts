import { NgModule } from '@angular/core';
import { VolleybalatleetToevoegenComponent } from './volleybalatleet-toevoegen/volleybalatleet-toevoegen.component';
import { SharedModule } from 'src/app/shared/shared.module';



@NgModule({
  declarations: [VolleybalatleetToevoegenComponent],
  imports: [
    SharedModule
  ]
})
export class VolleybalatleetToevoegenModule { }
