import { Injectable } from '@angular/core';
import { VoetbalAtleet } from '../../../models/voetbal/voetbal-atleet/voetbal-atleet.model';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class VoetbalAtleetService {

  constructor(private http: HttpClient) { }

  getAtleten(): Observable<VoetbalAtleet[]> {
      return this.http.get<VoetbalAtleet[]>("http://localhost:8762/sportapi/voetbalAtleets/getatleten");
  }

  getAtleet(voetbalAtleetID: string): Observable<VoetbalAtleet> {
    return this.http.get<VoetbalAtleet>("http://localhost:8762/sportapi/voetbalAtleets/getatleet/" + voetbalAtleetID);
}

  addAtleet(voetbalAtleet: VoetbalAtleet) {
      return this.http.post<VoetbalAtleet>("http://localhost:8762/sportapi/voetbalAtleets/postatleet", voetbalAtleet);
  }

  updateAtleet(voetbalAtleet: VoetbalAtleet) {
      return this.http.put<VoetbalAtleet>("http://localhost:8762/sportapi/voetbalAtleets/putatleet", voetbalAtleet);
  }

  deleteAtleet(voetbalAtleetID: number) {
      return this.http.delete<VoetbalAtleet>("http://localhost:8762/sportapi/voetbalAtleets/deleteatleet/" + voetbalAtleetID);
  }
}