package org.devathome.api_food.services;

import org.devathome.api_food.entity.AlimentosEntity;
import org.devathome.api_food.repository.AlimentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlimentosServices {

    private final AlimentosRepository alimentosRepository;

    @Autowired
    public AlimentosServices(AlimentosRepository alimentosRepository) {
        this.alimentosRepository = alimentosRepository;
    }

    public List<AlimentosEntity> findAll() {
        return alimentosRepository.findAll(); // Use o método findAll() do repositório
    }

    public Optional<AlimentosEntity> findOne(Long id) {
        return alimentosRepository.findById(id); // Use o método findById() do repositório
    }

    public Optional<AlimentosEntity> salvarAlimento(AlimentosEntity atualizar){
        alimentosRepository.save(atualizar);
        return null;
    }
}
