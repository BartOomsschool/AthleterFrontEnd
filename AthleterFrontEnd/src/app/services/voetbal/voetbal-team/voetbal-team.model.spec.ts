import { VoetbalTeamService } from './voetbal-team.model';
import { TestBed } from '@angular/core/testing';

describe('VoetbalTeamService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: VoetbalTeamService = TestBed.get(VoetbalTeamService);
    expect(service).toBeTruthy();
  });
});
