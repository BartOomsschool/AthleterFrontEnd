import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VoetbalatleetBeherenComponent } from './voetbalatleet-beheren.component';

describe('VoetbalatleetBeherenComponent', () => {
  let component: VoetbalatleetBeherenComponent;
  let fixture: ComponentFixture<VoetbalatleetBeherenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VoetbalatleetBeherenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VoetbalatleetBeherenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
