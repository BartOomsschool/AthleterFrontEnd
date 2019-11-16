import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VoetbalComponent } from './voetbal.component';

describe('VoetbalComponent', () => {
  let component: VoetbalComponent;
  let fixture: ComponentFixture<VoetbalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VoetbalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VoetbalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
