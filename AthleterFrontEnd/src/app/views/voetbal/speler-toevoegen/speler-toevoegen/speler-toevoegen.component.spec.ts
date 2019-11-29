import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SpelerToevoegenComponent } from './speler-toevoegen.component';

describe('SpelerToevoegenComponent', () => {
  let component: SpelerToevoegenComponent;
  let fixture: ComponentFixture<SpelerToevoegenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SpelerToevoegenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SpelerToevoegenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
