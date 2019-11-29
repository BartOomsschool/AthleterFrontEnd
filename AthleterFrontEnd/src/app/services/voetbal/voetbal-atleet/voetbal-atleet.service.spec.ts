import { TestBed } from '@angular/core/testing';

import { VoetbalAtleetService } from './voetbal-atleet.service';

describe('VoetbalAtleetService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: VoetbalAtleetService = TestBed.get(VoetbalAtleetService);
    expect(service).toBeTruthy();
  });
});
