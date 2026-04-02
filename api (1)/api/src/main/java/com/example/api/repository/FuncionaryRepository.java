package com.example.api.repository;

import com.example.api.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionaryRepository extends JpaRepository <FuncionarioModel,Long> {
}
