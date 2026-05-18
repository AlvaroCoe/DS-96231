package com.example.exercicioDTO.repository;

import com.example.exercicioDTO.entity.ProfessorEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfessorRepository extends JpaRepository <ProfessorEntity, Long> {

    Optional<ProfessorEntity> findByCodigoAcesso (String codigoAcesso);
    Optional<ProfessorEntity> findByEmail(String email);

    @Transactional
    void deleteByCodigoAcesso (String codigoAcesso);
}

