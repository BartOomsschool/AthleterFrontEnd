package com.team9.edge.service.models.Voetbal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class VoetbalAtleet {
    private String voetbalAtleetID;
    private String naam;
    private String team;
    private String positie;


    public VoetbalAtleet() {
    }

    public VoetbalAtleet(String voetbalAtleetID, String naam, String team, String positie) {
        this.voetbalAtleetID = voetbalAtleetID;
        this.team = team;
        this.positie = positie;
        this.naam = naam;
    }

    public VoetbalAtleet( String naam, String team, String positie) {
        this.team = team;
        this.positie = positie;
        this.naam = naam;
    }




    public String getVoetbalAtleetID() {
        return voetbalAtleetID;
    }

    public void setVoetbalAtleetID(String voetbalAtleetID) {
        this.voetbalAtleetID = voetbalAtleetID;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPositie() {
        return positie;
    }

    public void setPositie(String positie) {
        this.positie = positie;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
