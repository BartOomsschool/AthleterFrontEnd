import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VoetbalatleetUpdatenComponent } from './voetbalatleet-updaten.component';

describe('VoetbalatleetUpdatenComponent', () => {
  let component: VoetbalatleetUpdatenComponent;
  let fixture: ComponentFixture<VoetbalatleetUpdatenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VoetbalatleetUpdatenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VoetbalatleetUpdatenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
