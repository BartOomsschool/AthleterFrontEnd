import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HockeyatleetToevoegenComponent } from './hockeyatleet-toevoegen.component';

describe('HockeyatleetToevoegenComponent', () => {
  let component: HockeyatleetToevoegenComponent;
  let fixture: ComponentFixture<HockeyatleetToevoegenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HockeyatleetToevoegenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HockeyatleetToevoegenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
