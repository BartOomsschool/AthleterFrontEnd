package com.team9.edge.service.models.Voetbal;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class VoetbalPositie {

    private String positieID;
    private String number;

    public VoetbalPositie() {
    }

    public VoetbalPositie(String number) {

        this.number = number;
    }

    public String getPositieID() {
        return positieID;
    }

    public void setPositieID(String positieID) {
        this.positieID = positieID;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
