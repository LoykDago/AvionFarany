package com.loyk.sync.Entities;

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
@Subselect("select * from AvionAssurance3")
@Table(name="AvionAssurance3")
public class AvionAssurance3 {
    @Id
    @Column(name = "idavion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idAvion;

    @Column(name="nomavion")
    String nomavion;

    public AvionAssurance3(){}
    public AvionAssurance3(long idAvion,String nomavion){
        this.idAvion=idAvion;
        this.nomavion=nomavion;
    }
    
    public long getIdAvion() {
        return idAvion;
    }
    public void setIdAvion(long idAvion) {
        this.idAvion = idAvion;
    }
    public String getNomAvion() {
        return nomavion;
    }
    public void setNomAvion(String nomavion) {
        this.nomavion = nomavion;
    }
}
