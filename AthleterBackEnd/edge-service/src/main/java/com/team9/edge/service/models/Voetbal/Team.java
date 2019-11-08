package com.team9.edge.service.models.Voetbal;

public class Team {
    private int teamID;
    private String teamNaam;

    public Team() {
    }

    public Team(int teamID, String teamNaam) {
        this.teamID = teamID;
        this.teamNaam = teamNaam;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public String getTeamNaam() {
        return teamNaam;
    }

    public void setTeamNaam(String teamNaam) {
        this.teamNaam = teamNaam;
    }
}
