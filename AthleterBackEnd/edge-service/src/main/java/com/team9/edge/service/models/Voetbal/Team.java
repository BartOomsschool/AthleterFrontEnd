package com.team9.edge.service.models.Voetbal;

public class Team {
    private String teamID;
    private String teamNaam;

    public Team() {
    }

    public Team(String teamID, String teamNaam) {
        this.teamID = teamID;
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
