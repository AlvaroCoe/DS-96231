package com.example.game_senai.repository;

import com.example.game_senai.entity.JogadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JogadorRepository extends JpaRepository<JogadorEntity, Long> {
    Optional<JogadorEntity> findByEmail(String email);
    Optional<JogadorEntity> findByLogin(String login);

    @Transactional
    void deleteByLogin(String login); // Novo método
}
