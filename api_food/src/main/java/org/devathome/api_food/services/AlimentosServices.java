package org.devathome.api_food.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlimentosServices {

    @Autowired
    AlimentosRepository alimentosRepository;

    List<AlimentosRepository> findAll(){

        return repository.findAll();
    }
    
}
