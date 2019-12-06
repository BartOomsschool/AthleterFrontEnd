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
    return this.http.get<HockeyAtleet[]>("http://localhost:8762/sportapi/hockeyAtleets/getAtleten");
  }

  getHockeyAtleet(id: string){
    return this.http.get<HockeyAtleet>("http://localhost:8762/sportapi/hockeyAtleets/getAtleet/" + id);
  }

  deleteHockeyAtleet(id: string){
    return this.http.delete<HockeyAtleet>("http://localhost:8762/sportapi/hockeyAtleets/" + id)
  }

  addHockeyAtleet(atleet: HockeyAtleet){
    return this.http.post<HockeyAtleet>("http://localhost:8762/sportapi/hockeyAtleets/postAtleet/", atleet);
  }

  updateHockeyAtleet(atleet: HockeyAtleet){
    return this.http.put<HockeyAtleet>("http://localhost:8762/sportapi/hockeyAtleets/putAtleet/", atleet);
  }

}
