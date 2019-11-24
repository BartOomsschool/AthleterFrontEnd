import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { VoetbalTeam } from 'src/app/models/voetbal/voetbal-team/voetbal-team.model';

@Injectable({
  providedIn: 'root'
})
export class VoetbalTeamService {

  constructor(private http: HttpClient) { }

  getTeams(): Observable<VoetbalTeam[]> {
      return this.http.get<VoetbalTeam[]>("http://localhost:8050/voetbalTeams/getvoetbalteams");
  }

  addTeam(team: VoetbalTeam) {
      return this.http.post<VoetbalTeam>("http://localhost:8050/voetbalTeams/postVoetbalTeam", team);
  }

  updateTeam(teamID: number, team: VoetbalTeam) {
      return this.http.put<VoetbalTeam>("http://localhost:8050/voetbalTeams/updateVoetbalTeam/" + teamID, team);
  }

  deleteTeam(teamID: number) {
      return this.http.delete<VoetbalTeam>("http://localhost:8050/voetbalTeams/deleteVoetbalTeam/" + teamID);
  }
}
