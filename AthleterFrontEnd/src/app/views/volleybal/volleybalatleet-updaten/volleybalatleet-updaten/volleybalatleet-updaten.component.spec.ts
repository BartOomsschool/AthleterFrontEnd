import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VolleybalatleetUpdatenComponent } from './volleybalatleet-updaten.component';

describe('VolleybalatleetUpdatenComponent', () => {
  let component: VolleybalatleetUpdatenComponent;
  let fixture: ComponentFixture<VolleybalatleetUpdatenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VolleybalatleetUpdatenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VolleybalatleetUpdatenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
