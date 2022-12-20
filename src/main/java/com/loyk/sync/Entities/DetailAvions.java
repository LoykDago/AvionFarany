package com.loyk.sync.Entities;

import java.io.Serializable;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Immutable
@Subselect("select * from detailAvions")
@Table(name="detailAvions") 
public class DetailAvions implements Serializable{
    @Id
    @Column(name = "idavion")
    @GeneratedValue(strategy=GenerationType.AUTO)
    long idAvion;
    @Column(name =  "nomavion")
    String nomavion;
    @Column(name =  "nbplaces")
    int nbplaces;
    @Column(name =  "kilometres")
    int kilometres;
    
    public DetailAvions() {
    }
    
    public DetailAvions(long idAvion, String nomavion, int nbplaces, int kilometres) {
        this.idAvion = idAvion;
        this.nomavion = nomavion;
        this.nbplaces = nbplaces;
        this.kilometres = kilometres;
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
    public int getKilometres() {
        return kilometres;
    }
    public void setKilometres(int kilometres) {
        this.kilometres = kilometres;
    }
    
}
