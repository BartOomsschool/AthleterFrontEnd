import { VoetbalAtleet } from './voetbal-atleet.model';

describe('VoetbalAtleet', () => {
  it('should create an instance', () => {
    expect(new VoetbalAtleet('','','','')).toBeTruthy();
  });
});
