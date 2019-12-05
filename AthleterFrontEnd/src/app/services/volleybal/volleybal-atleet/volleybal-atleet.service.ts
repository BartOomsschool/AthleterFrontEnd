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
      return this.http.get<VolleybalAtleet[]>("http://localhost:8762/sportapi/volleyballAtleets/getVolleyballAtleets");
  }

  getAtleet(volleybalAtleetID: string): Observable<VolleybalAtleet> {
    return this.http.get<VolleybalAtleet>("http://localhost:8762/sportapi/volleyballAtleets/getatleet/" + volleybalAtleetID);
}

  addAtleet(voetbalAtleet: VolleybalAtleet) {
      return this.http.post<VolleybalAtleet>("http://localhost:8762/sportapi/volleyballAtleets/postvolleyballAtleet", voetbalAtleet);
  }

  updateAtleet(volleybalAtleet: VolleybalAtleet) {
      return this.http.put<VolleybalAtleet>("http://localhost:8762/sportapi/volleyballAtleets/putvolleyballAtleet", volleybalAtleet);
  }

  deleteAtleet(volleybalAtleetID: string) {
      return this.http.delete<VolleybalAtleet>("http://localhost:8762/sportapi/volleyballAtleets/deletevolleyballAtleet/" + volleybalAtleetID);
  }
}
