import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Positie } from 'src/app/models/voetbal/positie/positie.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PositieService {

  constructor(private http: HttpClient) { }

  getPosities(): Observable<Positie[]> {
      return this.http.get<Positie[]>("http://localhost:8050/posities/getPosities");
  }

  addPositie(positie: Positie) {
      return this.http.post<Positie>("http://localhost:8050/posities/postPositie", positie);
  }

  updatePositie(positieID: number, positie: Positie) {
      return this.http.put<Positie>("http://localhost:8050/posities/updatePositie/" + positieID, positie);
  }

  deletePositie(positieID: number) {
      return this.http.delete<Positie>("http://localhost:8050/posities/deletePositie/" + positieID);
  }
}
