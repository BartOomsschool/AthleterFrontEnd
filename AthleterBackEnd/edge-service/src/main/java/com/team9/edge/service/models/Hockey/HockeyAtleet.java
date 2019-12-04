package com.team9.edge.service.models.Hockey;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown =  true)
@ApiModel(description = "Alles over Hockey Atleet")
public class HockeyAtleet {
        @ApiModelProperty(notes = "De database genereert de ID met autonummering")
        private String ID;
        @ApiModelProperty(notes = "De naam van de atleet")
        private String Naam;
        @ApiModelProperty(notes = "De naam van het team waarvoor de atleet speelt")
        private String ploeg;
        @ApiModelProperty(notes = "De positie waarop de atleet speelt")
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

