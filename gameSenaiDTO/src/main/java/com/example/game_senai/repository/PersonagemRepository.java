package com.example.game_senai.repository;

import com.example.game_senai.entity.PersonagemEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonagemRepository extends JpaRepository<PersonagemEntity, Long> {
    Optional<PersonagemEntity> findByNome(String nome);

    @Transactional
    void deleteByNome(String nome);
}
