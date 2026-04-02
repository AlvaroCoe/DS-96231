package com.example.Api_20.repository;

import com.example.Api_20.model.PetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository <PetModel, Long> {
}
