package com.team9.edge.service.models.Hockey;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Positie {
    private String positieID;
    private String naam;

    public Positie() {
    }

    public Positie(String naam) {
        this.naam = naam;
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
}
