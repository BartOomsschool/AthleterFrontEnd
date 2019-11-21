import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PositieToevoegenComponent } from './positie-toevoegen.component';

describe('PositieToevoegenComponent', () => {
  let component: PositieToevoegenComponent;
  let fixture: ComponentFixture<PositieToevoegenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PositieToevoegenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PositieToevoegenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
