import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HockeyatleetUpdatenComponent } from './hockeyatleet-updaten.component';

describe('HockeyatleetUpdatenComponent', () => {
  let component: HockeyatleetUpdatenComponent;
  let fixture: ComponentFixture<HockeyatleetUpdatenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HockeyatleetUpdatenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HockeyatleetUpdatenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
