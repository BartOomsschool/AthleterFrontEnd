import { TestBed } from '@angular/core/testing';

import { HockeyAtleetService } from './hockey-atleet.service';

describe('HockeyAtleetService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: HockeyAtleetService = TestBed.get(HockeyAtleetService);
    expect(service).toBeTruthy();
  });
});
