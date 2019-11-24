package com.team9.edge.service.models.Voetbal;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class VoetbalTeam {

    private String teamID;
    private String teamNaam;

    public VoetbalTeam() {
    }

    public VoetbalTeam(String teamNaam) {

        this.teamNaam = teamNaam;
    }

    public String getTeamID() {
        return teamID;
    }

    public void setTeamID(String teamID) {
        this.teamID = teamID;
    }

    public String getTeamNaam() {
        return teamNaam;
    }

    public void setTeamNaam(String teamNaam) {
        this.teamNaam = teamNaam;
    }


}
