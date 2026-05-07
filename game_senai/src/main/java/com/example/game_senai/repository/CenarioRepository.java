package com.example.game_senai.repository;

import com.example.game_senai.entity.CenarioEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CenarioRepository extends JpaRepository<CenarioEntity, Long> {
    Optional<CenarioEntity> findByNome(String nome);

    @Transactional // Importante para operações de delete customizadas
    void deleteByNome(String nome);
}