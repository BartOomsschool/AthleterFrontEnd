import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VoetbalAtleetToevoegenComponent } from './voetbalatleet-toevoegen.component';

describe('SpelerToevoegenComponent', () => {
  let component: VoetbalAtleetToevoegenComponent;
  let fixture: ComponentFixture<VoetbalAtleetToevoegenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VoetbalAtleetToevoegenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VoetbalAtleetToevoegenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
