package com.loyk.sync.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Utilisateur")
public class Utilisateur {
    @Id
    @Column(name = "idutilisateur")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idUtilisateur;
    @Column(name =  "pseudo")
    String pseudo;
    @Column(name =  "motdepasse")
    String motdepasse;
    
    
    public Utilisateur() {
    }
    public Utilisateur(long idUtilisateur, String pseudo, String motdepasse) {
        this.idUtilisateur = idUtilisateur;
        this.pseudo = pseudo;
        this.motdepasse = motdepasse;
    }
    public long getIdUtilisateur() {
        return idUtilisateur;
    }
    public void setIdUtilisateur(long idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }
    public String getPseudo() {
        return pseudo;
    }
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    public String getMotdepasse() {
        return motdepasse;
    }
    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }
   
}
