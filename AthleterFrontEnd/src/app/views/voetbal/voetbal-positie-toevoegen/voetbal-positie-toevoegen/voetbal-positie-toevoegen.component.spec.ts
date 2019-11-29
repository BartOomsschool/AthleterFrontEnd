import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VoetbalPositieToevoegenComponent } from './voetbal-positie-toevoegen.component';

describe('VoetbalPositieToevoegenComponent', () => {
  let component: VoetbalPositieToevoegenComponent;
  let fixture: ComponentFixture<VoetbalPositieToevoegenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VoetbalPositieToevoegenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VoetbalPositieToevoegenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
