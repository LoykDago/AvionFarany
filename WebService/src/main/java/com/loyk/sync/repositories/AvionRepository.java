package com.loyk.sync.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.loyk.sync.Entities.Avion;

public interface AvionRepository extends JpaRepository<Avion,Long> {
    
}
