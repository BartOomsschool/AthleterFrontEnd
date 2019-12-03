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
    return this.http.get<BadmintonAtleet[]>("http://localhost:8050/badminton/getBadmintonatleten");
}
}
