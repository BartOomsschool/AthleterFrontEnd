import { Injectable } from '@angular/core';
import { Speler } from '../../../models/voetbal/speler/speler.model';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SpelerService {

  constructor(private http: HttpClient) { }

  getSpelers(): Observable<Speler[]> {
      return this.http.get<Speler[]>("http://localhost:8050/spelers/getspelers");
  }

  addSpeler(speler: Speler) {
      return this.http.post<Speler>("http://localhost:8050/spelers/postSpeler", speler);
  }

  updateSpeler(spelerID: number, speler: Speler) {
      return this.http.put<Speler>("http://localhost:8050/spelers/updateSpeler/" + spelerID, speler);
  }

  deleteSpeler(spelerID: number) {
      return this.http.delete<Speler>("http://localhost:8050/spelers/deleteSpeler/" + spelerID);
  }
}