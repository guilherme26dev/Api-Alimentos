package org.devathome.api_food.repository;

import org.devathome.api_food.entity.AlimentosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimentosRepository extends JpaRepository<AlimentosEntity, Long> {
    //Find by Value - encontra o alimento pelo menor valor
    /* @Query("SELECT descricao FROM ALIMENTO WHERE MIN(VALOR)") */
    //Find By Preferences - encontra o alimento pela preferencia do usuario
    


}
