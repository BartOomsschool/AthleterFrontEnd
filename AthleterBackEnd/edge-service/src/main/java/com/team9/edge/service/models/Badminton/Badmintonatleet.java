package com.team9.edge.service.models.Badminton;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Alles over de badmintonAtleet")
public class Badmintonatleet {
    @ApiModelProperty(notes = "de database genereert de id met autonummering")
    private int atleetID;
    @ApiModelProperty(notes = "Type discipline waarin de speler speelt")
    private String categorie;
    @ApiModelProperty(notes = "De rank die de speler heeft")
    private int rank;
    @ApiModelProperty(notes = "Het land waarvan de speler afkomstig is")
    private String land;
    @ApiModelProperty(notes = "Naam van de speler")
    private String naam;
    @ApiModelProperty(notes = "Het aantal punten dat de speler heeft")
    private int punten;
    @ApiModelProperty(notes = "Aantal gewonnen toernooien")
    private int toernooien;
    @ApiModelProperty(notes = "Afbeelding van de speler")
    private String afbeelding;
    @ApiModelProperty(notes = "Partner waarmee de speler samen speelt")
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
