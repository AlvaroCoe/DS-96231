package com.example.dto_revisao.repository;

import com.example.dto_revisao.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository <UsuarioEntity, Long> {
    Optional <UsuarioEntity> findByEmail (String email);
}
