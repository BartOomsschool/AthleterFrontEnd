import { Speler } from './speler.model';

describe('Speler', () => {
  it('should create an instance', () => {
    expect(new Speler('','','','',new Date())).toBeTruthy();
  });
});
