import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VolleybalatleetToevoegenComponent } from './volleybalatleet-toevoegen.component';

describe('VolleybalatleetToevoegenComponent', () => {
  let component: VolleybalatleetToevoegenComponent;
  let fixture: ComponentFixture<VolleybalatleetToevoegenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VolleybalatleetToevoegenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VolleybalatleetToevoegenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
