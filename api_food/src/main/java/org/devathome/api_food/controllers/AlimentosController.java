package org.devathome.api_food.controllers;

import java.util.List;
import java.util.Optional;

import org.devathome.api_food.repository.AlimentosRepository;
import org.devathome.api_food.services.AlimentosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value="/api/v1/alimentos")
public class AlimentosController {
    private final AlimentosServices alimentosService;

    @Autowired
    public AlimentosController(AlimentosServices alimentosService){
        this.alimentosService = alimentosService;
    }

    @GetMapping
    public List<AlimentosRepository> getAllAlimentos(){
        return alimentosService.findAll();
    }
    
    @GetMapping(value="{id}", produces = "application/json")
    public Optional<AlimentosRepository> getById(@RequestParam Long id) {
        return alimentosService.findOne(id);
    }


    

}
