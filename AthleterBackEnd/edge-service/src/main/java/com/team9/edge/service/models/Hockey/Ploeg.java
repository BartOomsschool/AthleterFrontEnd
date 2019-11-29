package com.team9.edge.service.models.Hockey;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ploeg {

    private String ploegID;
    private String naam;

    public Ploeg() {
    }

    public Ploeg(String naam) {
        this.naam = naam;
    }

    public String getPloegID() {
        return ploegID;
    }

    public void setPloegID(String ploegID) {
        this.ploegID = ploegID;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
