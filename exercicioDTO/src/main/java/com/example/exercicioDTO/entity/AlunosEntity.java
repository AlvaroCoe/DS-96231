package com.example.exercicioDTO.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name = "tab_alunos")
public class AlunosEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String nome;

    @Column (nullable = false, unique = true)
    private String email;

    @Column (nullable = false)
    private String curso;

    @NotNull // Adicionado
    @Enumerated(EnumType.STRING) // Recomendado para Enums
    @Column(nullable = false)
    private Turno turno;

    @Column (nullable = false, unique = true)
    private String codigoAcesso;

    @Column (nullable = false)
    private String senha;

    public AlunosEntity() {
    }

    public AlunosEntity(Long id, String nome, String email, String curso, Turno turno, String codigoAcesso, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.curso = curso;
        this.turno = turno;
        this.codigoAcesso = codigoAcesso;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public String getCodigoAcesso() {
        return codigoAcesso;
    }

    public void setCodigoAcesso(String codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
