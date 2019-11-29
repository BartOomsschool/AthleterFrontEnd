package com.team9.edge.service.models.Hockey;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown =  true)
public class HockeyAtleet {
        private String ID;
        private String Naam;
        private String ploeg;
        private String Positie;

    public HockeyAtleet() {
    }

    public HockeyAtleet(String naam) {
        Naam = naam;
    }

    public HockeyAtleet(String ID, String naam, String ploeg, String positie) {
        this.ID = ID;
        Naam = naam;
        this.ploeg = ploeg;
        Positie = positie;
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

    public String getPloeg() {
        return ploeg;
    }

    public void setPloeg(String ploeg) {
        this.ploeg = ploeg;
    }

    public String getPositie() {
        return Positie;
    }

    public void setPositie(String positie) {
        Positie = positie;
    }
}

