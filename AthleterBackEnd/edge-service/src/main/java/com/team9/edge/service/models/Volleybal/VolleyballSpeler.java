package com.team9.edge.service.models.Volleybal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class VolleyballSpeler {
    private String id;
    private String naam;
    private String lengteInCm;
    private String selecties;
    private String geboortedatum;
    private String geslacht;
    private String positieId;
    private String teamId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getLengteInCm() {
        return lengteInCm;
    }

    public void setLengteInCm(String lengteInCm) {
        this.lengteInCm = lengteInCm;
    }

    public String getSelecties() {
        return selecties;
    }

    public void setSelecties(String selecties) {
        this.selecties = selecties;
    }

    public String getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(String geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public String getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(String geslacht) {
        this.geslacht = geslacht;
    }

    public String getPositieId() {
        return positieId;
    }

    public void setPositieId(String positieId) {
        this.positieId = positieId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public VolleyballSpeler() {
    }

    public VolleyballSpeler(String id, String naam, String lengteInCm, String selecties, String geboortedatum, String geslacht, String positieId, String teamId) {
        this.id = id;
        this.naam = naam;
        this.lengteInCm = lengteInCm;
        this.selecties = selecties;
        this.geboortedatum = geboortedatum;
        this.geslacht = geslacht;
        this.positieId = positieId;
        this.teamId = teamId;
    }

    public VolleyballSpeler(String naam, String lengteInCm, String selecties, String geboortedatum, String geslacht, String positieId, String teamId) {
        this.naam = naam;
        this.lengteInCm = lengteInCm;
        this.selecties = selecties;
        this.geboortedatum = geboortedatum;
        this.geslacht = geslacht;
        this.positieId = positieId;
        this.teamId = teamId;
    }
}
