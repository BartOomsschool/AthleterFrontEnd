import { Injectable } from '@angular/core';
import { VolleybalAtleet } from 'src/app/models/volleybal/volleybal-atleet/volleybal-atleet.model';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class VolleybalAtleetService {

  constructor(private http: HttpClient) { }

  getAtleten(): Observable<VolleybalAtleet[]> {
      return this.http.get<VolleybalAtleet[]>("http://localhost:8050/volleybalAtleets/getatleten");
  }

  getAtleet(volleybalAtleetID: string): Observable<VolleybalAtleet> {
    return this.http.get<VolleybalAtleet>("http://localhost:8050/volleybalAtleets/getatleet/" + volleybalAtleetID);
}

  addAtleet(voetbalAtleet: VolleybalAtleet) {
      return this.http.post<VolleybalAtleet>("http://localhost:8050/volleybalAtleets/postatleet", voetbalAtleet);
  }

  updateAtleet(volleybalAtleet: VolleybalAtleet) {
      return this.http.put<VolleybalAtleet>("http://localhost:8050/volleybalAtleets/putatleet", volleybalAtleet);
  }

  deleteAtleet(volleybalAtleetID: number) {
      return this.http.delete<VolleybalAtleet>("http://localhost:8050/volleybalAtleets/deleteatleet/" + volleybalAtleetID);
  }
}
