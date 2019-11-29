package com.team9.edge.service.models.Hockey;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown =  true)
public class Atleet {
        private String ID;
        private String Naam;
        private Date Geboortedatum;
        private String ploegID;
        private String PositieID;

    public Atleet() {
    }

    public Atleet(String ID, String naam, Date geboortedatum, String ploegID, String positieID) {
        this.ID = ID;
        Naam = naam;
        Geboortedatum = geboortedatum;
        this.ploegID = ploegID;
        PositieID = positieID;
    }

    public Atleet(String naam) {
        Naam = naam;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
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

    public String getPloegID() {
        return ploegID;
    }

    public void setPloegID(String ploegID) {
        this.ploegID = ploegID;
    }

    public String getPositieID() {
        return PositieID;
    }

    public void setPositieID(String positieID) {
        PositieID = positieID;
    }
}

