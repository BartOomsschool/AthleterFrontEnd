import { TestBed } from '@angular/core/testing';

import { AthleetService } from './athleet.service';

describe('AthleetService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AthleetService = TestBed.get(AthleetService);
    expect(service).toBeTruthy();
  });
});
