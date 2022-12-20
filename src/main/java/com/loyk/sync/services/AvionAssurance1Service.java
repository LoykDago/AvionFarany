package com.loyk.sync.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loyk.sync.Entities.AvionAssurance1;
import com.loyk.sync.repositories.AvionAssurance1Repository;

@Service
public class AvionAssurance1Service {
    
    @Autowired
     AvionAssurance1Repository aaRepository;

    public AvionAssurance1Service() {
    }

    public List<AvionAssurance1> getAll(){
        return aaRepository.findAll();
    }
    
}
