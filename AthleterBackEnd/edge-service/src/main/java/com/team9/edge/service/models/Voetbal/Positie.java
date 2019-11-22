package com.team9.edge.service.models.Voetbal;

public class Positie {
    private String positieID;
    private String number;

    public Positie(String positieID, String number) {
        this.positieID = positieID;
        this.number = number;
    }

    public Positie() {
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
