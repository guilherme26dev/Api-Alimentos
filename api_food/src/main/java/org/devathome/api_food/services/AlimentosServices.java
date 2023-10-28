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

    public List<AlimentosRepository> findAll() {
        return alimentosRepository.findAll();
    }

    public Optional<AlimentosRepository> findOne(Long id) {
        return alimentosRepository.findById(id);
    }
}
