package com.team9.edge.service.models.Voetbal;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {
    private String id;
    private String naam;

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

    public Team(String id, String naam) {
        this.id = id;
        this.naam = naam;
    }

    public Team() {
    }
}
