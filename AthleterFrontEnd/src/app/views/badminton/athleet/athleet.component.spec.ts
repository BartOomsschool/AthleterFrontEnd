import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AthleetComponent } from './athleet.component';

describe('AthleetComponent', () => {
  let component: AthleetComponent;
  let fixture: ComponentFixture<AthleetComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AthleetComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AthleetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
