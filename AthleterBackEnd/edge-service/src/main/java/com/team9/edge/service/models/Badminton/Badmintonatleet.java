package com.team9.edge.service.models.Badminton;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Badmintonatleet {
    private int atleetID;
    private String categorie;
    private int rank;
    private String land;
    private String naam;
    private int punten;
    private int toernooien;
    private String afbeelding;
    private Integer partnerID;

    public Badmintonatleet() {
    }

    public Badmintonatleet(int atleetID, String categorie, int rank, String land, String naam, int punten, int toernooien, String afbeelding, Integer partnerID) {
        this.atleetID = atleetID;
        this.categorie = categorie;
        this.rank = rank;
        this.land = land;
        this.naam = naam;
        this.punten = punten;
        this.toernooien = toernooien;
        this.afbeelding = afbeelding;
        this.partnerID = partnerID;
    }

    public int getAtleetID() {
        return atleetID;
    }

    public void setAtleetID(int atleetID) {
        this.atleetID = atleetID;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
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
