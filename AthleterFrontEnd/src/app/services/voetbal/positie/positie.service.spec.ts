import { TestBed } from '@angular/core/testing';

import { PositieService } from './positie.service';

describe('PositieService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PositieService = TestBed.get(PositieService);
    expect(service).toBeTruthy();
  });
});
