package com.team9.edge.service.models.Volleybal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Alles over VolleybalAtleet")
public class VolleyballAtleet {

    @ApiModelProperty(notes = "De database genereert de Id met auto nummering")
    private String volleyballid;
    @ApiModelProperty(notes = "De naam van de atleet")
    private String naam;
    @ApiModelProperty(notes = "De lengte van de atleet")
    private String lengteInCm;
    @ApiModelProperty(notes = "De selectie van de atleet")
    private String selecties;
    @ApiModelProperty(notes = "De geboortedatum van de atleet")
    private String geboortedatum;
    @ApiModelProperty(notes = "De geslacht van de atleet")
    private String geslacht;
    @ApiModelProperty(notes = "De positie van de atleet")
    private String positie;
    @ApiModelProperty(notes = "De team van de atleet")
    private String team;

    public String getVolleyballid() {
        return volleyballid;
    }

    public void setVolleyballid(String volleyballid) {
        this.volleyballid = volleyballid;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getLengteInCm() {
        return lengteInCm;
    }

    public void setLengteInCm(String lengteInCm) {
        this.lengteInCm = lengteInCm;
    }

    public String getSelecties() {
        return selecties;
    }

    public void setSelecties(String selecties) {
        this.selecties = selecties;
    }

    public String getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(String geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public String getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(String geslacht) {
        this.geslacht = geslacht;
    }

    public String getPositie() {
        return positie;
    }

    public void setPositie(String positie) {
        this.positie = positie;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public VolleyballAtleet() {
    }

    public VolleyballAtleet(String volleyballid, String naam, String lengteInCm, String selecties, String geboortedatum, String geslacht, String positie, String team) {
        this.volleyballid = volleyballid;
        this.naam = naam;
        this.lengteInCm = lengteInCm;
        this.selecties = selecties;
        this.geboortedatum = geboortedatum;
        this.geslacht = geslacht;
        this.positie = positie;
        this.team = team;
    }

    public VolleyballAtleet(String naam, String lengteInCm, String selecties, String geboortedatum, String geslacht, String positieId, String teamId) {
        this.naam = naam;
        this.lengteInCm = lengteInCm;
        this.selecties = selecties;
        this.geboortedatum = geboortedatum;
        this.geslacht = geslacht;
        this.positie = positieId;
        this.team = teamId;
    }
}
