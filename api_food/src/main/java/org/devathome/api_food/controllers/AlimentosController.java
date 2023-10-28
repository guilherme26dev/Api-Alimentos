package org.devathome.api_food.controllers;

import org.devathome.api_food.entity.AlimentosEntity;
import org.devathome.api_food.services.AlimentosServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
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

    @PostMapping
    public ResponseEntity<AlimentosEntity> post(@RequestBody AlimentosEntity entity){
        alimentosService.salvarAlimento(entity);
        return ResponseEntity.ok().body(null);
    } 

    @PutMapping(value = "{id}")
public ResponseEntity<AlimentosEntity> put(@PathVariable Long id, @RequestBody AlimentosEntity entity) {
    Optional<AlimentosEntity> existingAlimento = alimentosService.findOne(id);

    if (existingAlimento.isPresent()) {
        AlimentosEntity alimentos = existingAlimento.get();
        
        alimentos.setDescricao(entity.getDescricao());
        alimentos.setTipo(entity.getTipo());

        alimentosService.salvarAlimento(alimentos);

        return ResponseEntity.ok(alimentos);
    } else {
        return ResponseEntity.notFound().build();
    }
}


    @DeleteMapping(value="{id}")
    public ResponseEntity delete(@PathVariable Long id){
        alimentosService.findOne(id);
        return ResponseEntity.ok().body("Excluido com sucesso");
    }
}
