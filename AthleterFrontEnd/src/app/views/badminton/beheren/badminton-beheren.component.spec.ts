import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BadmintonBeherenComponent } from './badminton-beheren.component';

describe('BadmintonBeherenComponent', () => {
  let component: BadmintonBeherenComponent;
  let fixture: ComponentFixture<BadmintonBeherenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BadmintonBeherenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BadmintonBeherenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
