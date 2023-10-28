package org.devathome.api_food.controllers;

import org.devathome.api_food.entity.AlimentosEntity;
import org.devathome.api_food.services.AlimentosServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/alimentos")
public class AlimentosController {
    private final AlimentosServices alimentosService;

    public AlimentosController(AlimentosServices alimentosService) {
        this.alimentosService = alimentosService;
    }

    @GetMapping
    public List<AlimentosEntity> getAllAlimentos() {
        return alimentosService.findAll();
    }

    @GetMapping(value = "{id}", produces = "application/json")
    public Optional<AlimentosEntity> getById(@PathVariable Long id) {
        return alimentosService.findOne(id);
    }
}
