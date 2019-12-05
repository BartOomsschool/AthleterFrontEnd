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
      return this.http.get<VolleybalAtleet[]>("http://localhost:8050/volleyballAtleets/getVolleyballAtleets");
  }

  getAtleet(volleybalAtleetID: string): Observable<VolleybalAtleet> {
    return this.http.get<VolleybalAtleet>("http://localhost:8050/volleyballAtleets/getatleet/" + volleybalAtleetID);
}

  addAtleet(voetbalAtleet: VolleybalAtleet) {
      return this.http.post<VolleybalAtleet>("http://localhost:8050/volleyballAtleets/postvolleyballAtleet", voetbalAtleet);
  }

  updateAtleet(volleybalAtleet: VolleybalAtleet) {
      return this.http.put<VolleybalAtleet>("http://localhost:8050/volleyballAtleets/putvolleyballAtleet", volleybalAtleet);
  }

  deleteAtleet(volleybalAtleetID: string) {
      return this.http.delete<VolleybalAtleet>("http://localhost:8050/volleyballAtleets/deletevolleyballAtleet/" + volleybalAtleetID);
  }
}
