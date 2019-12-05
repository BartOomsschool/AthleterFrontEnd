import { Injectable } from '@angular/core';
import { BadmintonAtleet } from '../../../models/badminton/badminton-atleet/badminton-atleet.model';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BadmintonAtleetService {

  constructor(private http: HttpClient) { }  

  getBadmintonAtleten(): Observable<BadmintonAtleet[]> {
    return this.http.get<BadmintonAtleet[]>("http://localhost:8762/sportapi/badminton/getBadmintonatleten");
  } 

  addBadmintonAtleet(atleet: BadmintonAtleet) {
    return this.http.post<BadmintonAtleet>("http://localhost:8762/sportapi/badminton/postBadmintonatleet", atleet);
  }

  updateBadmintonAtleet(atleet: BadmintonAtleet) {
    return this.http.put<BadmintonAtleet>("http://localhost:8762/sportapi/badminton/putBadmintonatleet", atleet);
  }

  deleteBadmintonAtleet(id: number) {
    return this.http.delete<BadmintonAtleet>("http://localhost:8762/sportapi/badminton/deleteBadmintonatleet/" + id);
  }
}
