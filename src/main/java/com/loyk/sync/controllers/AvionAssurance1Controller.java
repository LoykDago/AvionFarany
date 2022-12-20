package com.loyk.sync.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loyk.sync.Entities.AvionAssurance1;
import com.loyk.sync.services.AvionAssurance1Service;

@CrossOrigin
@RestController
public class AvionAssurance1Controller {
    
    @Autowired
    AvionAssurance1Service service;

    @GetMapping("avionAssurance1")
    public List<AvionAssurance1> getAllAvion1(){
        return service.getAll();
    }

    
}
