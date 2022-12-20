package com.loyk.sync.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loyk.sync.Entities.Avion;
import com.loyk.sync.services.AvionService;

@CrossOrigin
@RestController
public class AvionController {
    
    @Autowired
    AvionService   avionService;

    @GetMapping("hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("avions")
    public List<Avion> getAllAvion(){
        return  avionService.getAllAvion();
    }

}
