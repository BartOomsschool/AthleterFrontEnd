package com.team9.edge.service.models.Voetbal;

public class Positie {
    private int positieID;
    private int number;

    public Positie(int positieID, int number) {
        this.positieID = positieID;
        this.number = number;
    }

    public Positie() {
    }

    public int getPositieID() {
        return positieID;
    }

    public void setPositieID(int positieID) {
        this.positieID = positieID;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
