package org.devathome.api_food.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value="/api/v1/alimentos")
public class AlimentosController {
    @Autowired
    private AlimentosService alimentosService;

    @GetMapping
    public List<AlimentosService> getAll(){
        return alimentosService.getAll();
    }
    
    @GetMapping(value="{id}", produces = "application/json")
    public AlimentosService getById(@RequestParam Long id) {
        return alimentosSerice.findOne();
    }


    

}
