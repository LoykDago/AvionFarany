package com.loyk.sync.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loyk.sync.Entities.AvionAssurance3;
import com.loyk.sync.repositories.AvionAssurance3Repository;

@Service
public class AvionAssurance3Service {
   
    @Autowired
    AvionAssurance3Repository aaRepository;

    public AvionAssurance3Service() {
    }

    public List<AvionAssurance3> getAll(){
        return aaRepository.findAll();
    }

}
