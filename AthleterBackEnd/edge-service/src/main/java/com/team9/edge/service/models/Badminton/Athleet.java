package com.team9.edge.service.models.Badminton;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Athleet {
    private int athleetID;
    private Integer categorieID;
    private Integer landID;
    private String naam;
    private int punten;
    private int toernooien;
    private String afbeelding;
    private Integer partnerID;

    public Athleet() {
    }

    public Athleet(int athleetID, Integer categorieID, Integer landID, String naam, int punten, int toernooien, String afbeelding, Integer partnerID) {
        this.athleetID = athleetID;
        this.categorieID = categorieID;
        this.landID = landID;
        this.naam = naam;
        this.punten = punten;
        this.toernooien = toernooien;
        this.afbeelding = afbeelding;
        this.partnerID = partnerID;
    }

    public int getAthleetID() {
        return athleetID;
    }

    public void setAthleetID(int athleetID) {
        this.athleetID = athleetID;
    }

    public Integer getCategorieID() {
        return categorieID;
    }

    public void setCategorieID(Integer categorieID) {
        this.categorieID = categorieID;
    }

    public Integer getLandID() {
        return landID;
    }

    public void setLandID(Integer landID) {
        this.landID = landID;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        this.punten = punten;
    }

    public int getToernooien() {
        return toernooien;
    }

    public void setToernooien(int toernooien) {
        this.toernooien = toernooien;
    }

    public String getAfbeelding() {
        return afbeelding;
    }

    public void setAfbeelding(String afbeelding) {
        this.afbeelding = afbeelding;
    }

    public Integer getPartnerID() {
        return partnerID;
    }

    public void setPartnerID(Integer partnerID) {
        this.partnerID = partnerID;
    }
}
