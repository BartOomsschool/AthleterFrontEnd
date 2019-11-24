import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VoetbalTeamToevoegenComponent } from './voetbal-team-toevoegen.component';

describe('VoetbalTeamToevoegenComponent', () => {
  let component: VoetbalTeamToevoegenComponent;
  let fixture: ComponentFixture<VoetbalTeamToevoegenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VoetbalTeamToevoegenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VoetbalTeamToevoegenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
