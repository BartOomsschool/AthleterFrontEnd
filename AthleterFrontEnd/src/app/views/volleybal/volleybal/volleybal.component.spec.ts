import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VolleybalComponent } from './volleybal.component';

describe('VolleybalComponent', () => {
  let component: VolleybalComponent;
  let fixture: ComponentFixture<VolleybalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VolleybalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VolleybalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
