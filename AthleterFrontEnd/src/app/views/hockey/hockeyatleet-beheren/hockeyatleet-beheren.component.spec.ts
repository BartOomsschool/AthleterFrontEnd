import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HockeyatleetBeherenComponent } from './hockeyatleet-beheren.component';

describe('HockeyatleetBeherenComponent', () => {
  let component: HockeyatleetBeherenComponent;
  let fixture: ComponentFixture<HockeyatleetBeherenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HockeyatleetBeherenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HockeyatleetBeherenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
