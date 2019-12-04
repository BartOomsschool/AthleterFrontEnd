package com.team9.edge.service.models.Voetbal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Alles over VoetbalAtleet")
public class VoetbalAtleet {

    @ApiModelProperty(notes = "De database genereert de Id met auto nummering")
    private String voetbalAtleetID;
    @ApiModelProperty(notes = "De naam van de atleet")
    private String naam;
    @ApiModelProperty(notes = "De naam van het team van de atleet")
    private String team;
    @ApiModelProperty(notes = "De positie van de atleet op het veld")
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
