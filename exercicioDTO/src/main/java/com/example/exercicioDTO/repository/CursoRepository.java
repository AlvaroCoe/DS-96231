package com.example.exercicioDTO.repository;

import com.example.exercicioDTO.entity.CursoEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CursoRepository extends JpaRepository <CursoEntity, Long> {

    Optional <CursoEntity> findBySigla (String sigla);
    Optional <CursoEntity> findByNome (String nome);

    @Transactional
    void deleteBySigla (String sigla);
}
