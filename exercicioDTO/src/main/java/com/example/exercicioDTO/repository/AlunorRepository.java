package com.example.exercicioDTO.repository;

import com.example.exercicioDTO.entity.AlunosEntity;
import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlunorRepository extends JpaRepository <AlunosEntity, Long> {

    Optional <AlunosEntity> findByNome (String nome);

    @Transactional
    void deleteByNome (String nome);
}
