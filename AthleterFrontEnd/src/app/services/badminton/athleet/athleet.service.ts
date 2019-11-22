import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Athleet } from 'src/app/models/badminton/athleet/athleet.model';

@Injectable({
  providedIn: 'root'
})
export class AthleetService {

  constructor(private http: HttpClient) { }

  getAthleten(): Observable<Athleet[]> {
      return this.http.get<Athleet[]>("http://localhost:8050/badminton/getAthleten");
  }
}
