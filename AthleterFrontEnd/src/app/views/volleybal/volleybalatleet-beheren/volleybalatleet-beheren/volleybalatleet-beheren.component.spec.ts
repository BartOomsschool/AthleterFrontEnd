import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VolleybalatleetBeherenComponent } from './volleybalatleet-beheren.component';

describe('VolleybalatleetBeherenComponent', () => {
  let component: VolleybalatleetBeherenComponent;
  let fixture: ComponentFixture<VolleybalatleetBeherenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VolleybalatleetBeherenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VolleybalatleetBeherenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
