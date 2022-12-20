package com.loyk.sync.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loyk.sync.Entities.Avion;
import com.loyk.sync.repositories.AvionRepository;

@Service
public class AvionService {
    @Autowired
    AvionRepository avionRepository;

    public AvionService() {
    }

    public List<Avion> getAllAvion(){
        return avionRepository.findAll();
    }
    
}
