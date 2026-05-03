package com.example.apiRevisao.repository;

import com.example.apiRevisao.entity.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProfessorRepository extends JpaRepository <ProfessorEntity, Long> {
    Optional <ProfessorEntity> findByEmail (String email);
}
