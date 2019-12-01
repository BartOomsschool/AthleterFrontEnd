import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HockeyAtleet } from 'src/app/models/hockey/hockey-atleet/hockey-atleet.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HockeyAtleetService {

  constructor(private http: HttpClient) { }

  getHockeyAtleten(): Observable<HockeyAtleet[]> {
    return this.http.get<HockeyAtleet[]>("http://localhost:8050/hockeyAtleets/getAtleten");
  }

}
