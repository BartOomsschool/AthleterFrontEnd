package com.team9.edge.service.models.Badminton;

public class Categorie {
    private int categorieID;
    private String categorie;

    public Categorie() {
    }

    public Categorie(int categorieID, String categorie) {
        this.categorieID = categorieID;
        this.categorie = categorie;
    }

    public int getCategorieID() {
        return categorieID;
    }

    public void setCategorieID(int categorieID) {
        this.categorieID = categorieID;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}
