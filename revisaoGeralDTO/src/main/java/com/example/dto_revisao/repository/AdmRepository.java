package com.example.dto_revisao.repository;

import com.example.dto_revisao.entity.AdmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdmRepository extends JpaRepository<AdmEntity, Long> {
    Optional<AdmEntity> findByEmail (String email);



}
