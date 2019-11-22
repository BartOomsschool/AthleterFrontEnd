package com.team9.edge.service.models.Badminton;

public class Land {
    private int landID;
    private String land;
    private String vlagAfbeelding;

    public Land() {
    }

    public Land(int landID, String land, String vlagAfbeelding) {
        this.landID = landID;
        this.land = land;
        this.vlagAfbeelding = vlagAfbeelding;
    }

    public int getLandID() {
        return landID;
    }

    public void setLandID(int landID) {
        this.landID = landID;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getVlagAfbeelding() {
        return vlagAfbeelding;
    }

    public void setVlagAfbeelding(String vlagAfbeelding) {
        this.vlagAfbeelding = vlagAfbeelding;
    }
}
