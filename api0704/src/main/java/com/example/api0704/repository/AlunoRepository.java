package com.example.api0704.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api0704.entity.AlunoEntity;

@Repository
public interface AlunoRepository extends JpaRepository <AlunoEntity, Long> {

}
