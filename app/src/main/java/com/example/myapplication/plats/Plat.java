package com.example.myapplication.plats;

public class Plat {

    private String imageUrl;
    private String label;
    private Double prix;

    public Plat(String imageUrl, String label, Double prix) {
        this.imageUrl = imageUrl;
        this.label = label;
        this.prix = prix;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
}
