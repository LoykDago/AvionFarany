package com.loyk.sync.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loyk.sync.Entities.Utilisateur;
import com.loyk.sync.services.UtilisateurService;

@CrossOrigin
@RestController
public class UtilisateurController {
    @Autowired
    UtilisateurService utilisateurService;

    @PostMapping("checkUser")
    public String getDetailAvions(@RequestBody Utilisateur user){
        return  utilisateurService.checkUser(user);
    }
}
