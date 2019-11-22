import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TeamToevoegenComponent } from './team-toevoegen.component';

describe('TeamToevoegenComponent', () => {
  let component: TeamToevoegenComponent;
  let fixture: ComponentFixture<TeamToevoegenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TeamToevoegenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TeamToevoegenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
