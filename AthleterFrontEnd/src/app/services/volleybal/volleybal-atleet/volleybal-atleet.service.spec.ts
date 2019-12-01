import { TestBed } from '@angular/core/testing';

import { VolleybalAtleetService } from './volleybal-atleet.service';

describe('VolleybalAtleetService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: VolleybalAtleetService = TestBed.get(VolleybalAtleetService);
    expect(service).toBeTruthy();
  });
});
