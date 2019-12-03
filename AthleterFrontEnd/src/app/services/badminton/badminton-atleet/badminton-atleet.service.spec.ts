import { TestBed } from '@angular/core/testing';

import { BadmintonAtleetService } from './badminton-atleet.service';

describe('BadmintonAtleetService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BadmintonAtleetService = TestBed.get(BadmintonAtleetService);
    expect(service).toBeTruthy();
  });
});
