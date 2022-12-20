package com.loyk.sync.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Avion")
public class Avion {
    @Id
    @Column(name = "idavion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idAvion;
    @Column(name =  "nomavion")
    String nomavion;
    @Column(name =  "nbplaces")
    int nbplaces;
    @Column(name =  "image")
    String image;

    
    public Avion() {
    }


    public Avion(long idAvion, String nomavion, int nbplaces, String image) {
        this.idAvion = idAvion;
        this.nomavion = nomavion;
        this.nbplaces = nbplaces;
        this.image = image;
    }


    public long getIdAvion() {
        return idAvion;
    }


    public void setIdAvion(long idAvion) {
        this.idAvion = idAvion;
    }


    public String getNomavion() {
        return nomavion;
    }


    public void setNomavion(String nomavion) {
        this.nomavion = nomavion;
    }


    public int getNbplaces() {
        return nbplaces;
    }


    public void setNbplaces(int nbplaces) {
        this.nbplaces = nbplaces;
    }


    public String getImage() {
        return image;
    }


    public void setImage(String image) {
        this.image = image;
    }


   
    

}
