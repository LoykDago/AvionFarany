package com.loyk.sync.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.loyk.sync.Entities.DetailAvions;
import com.loyk.sync.services.DetailAvionsService;


@CrossOrigin
@RestController
public class DetailAvionsController {
    @Autowired
    DetailAvionsService  detailAvionsService;

    @GetMapping("detailsAvions/{id}")
    public DetailAvions getDetailAvions(@PathVariable(name="id")long id){
        return  detailAvionsService.getDetailAvions(id);
    }
}
