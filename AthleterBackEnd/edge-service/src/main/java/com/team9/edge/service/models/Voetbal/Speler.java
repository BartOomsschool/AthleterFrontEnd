package com.team9.edge.service.models.Voetbal;

import lombok.Data;

import java.util.Date;

@Data
public class Speler {
    private int spelerID;
    private Integer teamID;
    private Integer positieID;
    private String naam;
    private Date geboorteDatum;

    public Speler() {
    }

    public Speler(int spelerID, Integer teamID, Integer positieID, String naam, Date geboorteDatum) {
        this.spelerID = spelerID;
        this.teamID = teamID;
        this.positieID = positieID;
        this.naam = naam;
        this.geboorteDatum = geboorteDatum;
    }

    public int getId() {
        return spelerID;
    }

    public void setId(int spelerID) {
        this.spelerID = spelerID;
    }

    public Integer getTeamID() {
        return teamID;
    }

    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }

    public Integer getPositieID() {
        return positieID;
    }

    public void setPositieID(Integer positieID) {
        this.positieID = positieID;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Date getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(Date geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }
}
