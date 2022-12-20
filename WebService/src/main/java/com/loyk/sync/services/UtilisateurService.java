package com.loyk.sync.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loyk.sync.GenerationToken;
import com.loyk.sync.Entities.Utilisateur;
import com.loyk.sync.repositories.UtilisateurRepository;

@Service
public class UtilisateurService {
    @Autowired
    UtilisateurRepository utilisateurRepository;


    public UtilisateurService() {
    }

    public String checkUser(Utilisateur actuel){
        try {
            GenerationToken g=new GenerationToken();
            java.util.List<Utilisateur> list=utilisateurRepository.findAll();
		    for (int i = 0; i < list.size(); i++) {
			    if (list.get(i).getPseudo().equals(actuel.getPseudo())&& list.get(i).getMotdepasse().equals(actuel.getMotdepasse())) {
				    String value=""+actuel.getIdUtilisateur();
                    return g.GenerateToken(value);
			    }
		    }
            return "error";   
        } catch (Exception e) {
            System.out.println(e);
        }
		 return null;
    }
}
