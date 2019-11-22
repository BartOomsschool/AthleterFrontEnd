package com.team9.edge.service.models.Hockey;

import lombok.Data;

import java.util.Date;

@Data
public class Atleet {
        private Integer ID;
        private String Naam;
        private Date Geboortedatum;
        private Integer ploegID;
        private Integer PositieID;

    public Atleet() {
    }

    public Atleet(Integer ID, String naam, Date geboortedatum, Integer ploegID, Integer positieID) {
        this.ID = ID;
        Naam = naam;
        Geboortedatum = geboortedatum;
        ploegID = ploegID;
        PositieID = positieID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String naam) {
        Naam = naam;
    }

    public Date getGeboortedatum() {
        return Geboortedatum;
    }

    public void setGeboortedatum(Date geboortedatum) {
        Geboortedatum = geboortedatum;
    }

    public Integer getPloegID() {
        return ploegID;
    }

    public void setPloegID(Integer ploegID) {
        ploegID = ploegID;
    }

    public Integer getPositieID() {
        return PositieID;
    }

    public void setPositieID(Integer positieID) {
        PositieID = positieID;
    }
}

