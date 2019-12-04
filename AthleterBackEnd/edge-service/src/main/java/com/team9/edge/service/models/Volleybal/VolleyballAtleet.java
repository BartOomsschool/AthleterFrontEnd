package com.team9.edge.service.models.Volleybal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class VolleyballAtleet {
    private String volleyballid;
    private String naam;
    private String lengteInCm;
    private String selecties;
    private String geboortedatum;
    private String geslacht;
    private String positie;
    private String team;

    public String getVolleyballid() {
        return volleyballid;
    }

    public void setVolleyballid(String volleyballid) {
        this.volleyballid = volleyballid;
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

    public String getPositie() {
        return positie;
    }

    public void setPositie(String positie) {
        this.positie = positie;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public VolleyballAtleet() {
    }

    public VolleyballAtleet(String volleyballid, String naam, String lengteInCm, String selecties, String geboortedatum, String geslacht, String positie, String team) {
        this.volleyballid = volleyballid;
        this.naam = naam;
        this.lengteInCm = lengteInCm;
        this.selecties = selecties;
        this.geboortedatum = geboortedatum;
        this.geslacht = geslacht;
        this.positie = positie;
        this.team = team;
    }

    public VolleyballAtleet(String naam, String lengteInCm, String selecties, String geboortedatum, String geslacht, String positieId, String teamId) {
        this.naam = naam;
        this.lengteInCm = lengteInCm;
        this.selecties = selecties;
        this.geboortedatum = geboortedatum;
        this.geslacht = geslacht;
        this.positie = positieId;
        this.team = teamId;
    }
}
