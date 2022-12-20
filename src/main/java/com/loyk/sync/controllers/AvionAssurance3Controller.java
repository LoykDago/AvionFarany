package com.loyk.sync.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loyk.sync.Entities.AvionAssurance3;
import com.loyk.sync.services.AvionAssurance3Service;

@CrossOrigin
@RestController
public class AvionAssurance3Controller {
    
    @Autowired
    AvionAssurance3Service service;

    @GetMapping("avionAssurance3")
    public List<AvionAssurance3> getAllAvion3(){
        return service.getAll();
    }

    
}
