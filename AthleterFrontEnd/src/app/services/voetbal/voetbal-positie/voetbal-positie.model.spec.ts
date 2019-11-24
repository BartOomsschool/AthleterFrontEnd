import { VoetbalPositieService } from './voetbal-positie.model';
import { TestBed } from '@angular/core/testing';

describe('VoetbalPositieService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: VoetbalPositieService = TestBed.get(VoetbalPositieService);
    expect(service).toBeTruthy();
  });
});