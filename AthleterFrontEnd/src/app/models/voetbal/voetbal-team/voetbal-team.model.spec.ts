import { VoetbalTeam } from './voetbal-team.model';

describe('VoetbalTeam', () => {
  it('should create an instance', () => {
    expect(new VoetbalTeam('', '')).toBeTruthy();
  });
});
