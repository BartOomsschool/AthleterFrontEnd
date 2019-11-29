import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { VoetbalPositie } from 'src/app/models/voetbal/voetbal-positie/voetbal-positie.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class VoetbalPositieService {

  constructor(private http: HttpClient) { }

  getPosities(): Observable<VoetbalPositie[]> {
      return this.http.get<VoetbalPositie[]>("http://localhost:8050/voetbalPosities/getvoetbalposities");
  }

  addPositie(positie: VoetbalPositie) {
      return this.http.post<VoetbalPositie>("http://localhost:8050/voetbalPosities/postvoetbalpositie", positie);
  }

  updatePositie(positieID: number, positie: VoetbalPositie) {
      return this.http.put<VoetbalPositie>("http://localhost:8050/voetbalPosities/updateVoetbalPositie/" + positieID, positie);
  }

  deletePositie(positieID: number) {
      return this.http.delete<VoetbalPositie>("http://localhost:8050/voetbalPosities/deleteVoetbalPositie/" + positieID);
  }
}
