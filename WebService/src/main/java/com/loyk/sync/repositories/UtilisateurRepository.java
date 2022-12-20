package com.loyk.sync.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.loyk.sync.Entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long>{
    
}
