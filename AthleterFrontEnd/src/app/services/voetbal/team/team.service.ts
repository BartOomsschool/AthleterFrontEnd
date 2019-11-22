import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Team } from 'src/app/models/voetbal/team/team.model';

@Injectable({
  providedIn: 'root'
})
export class TeamService {

  constructor(private http: HttpClient) { }

  getTeams(): Observable<Team[]> {
      return this.http.get<Team[]>("http://localhost:8050/teams/getTeams");
  }

  addTeam(team: Team) {
      return this.http.post<Team>("http://localhost:8050/teams/postTeam", team);
  }

  updateTeam(teamID: number, team: Team) {
      return this.http.put<Team>("http://localhost:8050/teams/updateTeam/" + teamID, team);
  }

  deleteTeam(teamID: number) {
      return this.http.delete<Team>("http://localhost:8050/teams/deleteTeam/" + teamID);
  }
}
