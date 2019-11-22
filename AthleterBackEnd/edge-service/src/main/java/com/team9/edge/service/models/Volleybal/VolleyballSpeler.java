package com.team9.edge.service.models.Volleybal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class VolleyballSpeler {
    private String spelerID;
    private String teamID;
    private String positieID;
    private String naam;
    private Date geboorteDatum;

    public VolleyballSpeler() {
    }

    public VolleyballSpeler(String spelerID, String teamID, String positieID, String naam, Date geboorteDatum) {
        this.spelerID = spelerID;
        this.teamID = teamID;
        this.positieID = positieID;
        this.naam = naam;
        this.geboorteDatum = geboorteDatum;
    }

    public String getId() {
        return spelerID;
    }

    public void setId(String spelerID) {
        this.spelerID = spelerID;
    }

    public String getTeamID() {
        return teamID;
    }

    public void setTeamID(String teamID) {
        this.teamID = teamID;
    }

    public String getPositieID() {
        return positieID;
    }

    public void setPositieID(String positieID) {
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
