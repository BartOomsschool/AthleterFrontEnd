import { VoetbalPositie } from './voetbal-positie.model';

describe('VoetbalPositie', () => {
  it('should create an instance', () => {
    expect(new VoetbalPositie('', '')).toBeTruthy();
  });
});
