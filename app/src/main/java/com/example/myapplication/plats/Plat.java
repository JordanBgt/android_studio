package com.example.myapplication.plats;

import java.io.Serializable;

public class Plat implements Serializable {

    private String imageUrl;
    private String label;
    private Double prix;
    private String description;

    public Plat(String imageUrl, String label, Double prix, String description) {
        this.imageUrl = imageUrl;
        this.label = label;
        this.prix = prix;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
