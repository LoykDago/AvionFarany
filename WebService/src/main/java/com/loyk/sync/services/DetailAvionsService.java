package com.loyk.sync.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loyk.sync.Entities.DetailAvions;
import com.loyk.sync.repositories.DetailAvionsRepository;

@Service
public class DetailAvionsService {
    @Autowired
    DetailAvionsRepository detailAvionsRepository;

    public DetailAvionsService() {
    }

    public DetailAvions getDetailAvions(long id){
        Optional<DetailAvions> optinalEntity=detailAvionsRepository.findById( id);
        return optinalEntity.get();
    }
}
