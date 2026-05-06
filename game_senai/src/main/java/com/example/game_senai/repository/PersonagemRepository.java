package com.example.game_senai.repository;

import com.example.game_senai.entity.PersonagemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonagemRepository extends JpaRepository <PersonagemEntity, Long> {

  Optional <PersonagemEntity> findByNome (String nome);

  boolean existsByNome(String nome);
}
