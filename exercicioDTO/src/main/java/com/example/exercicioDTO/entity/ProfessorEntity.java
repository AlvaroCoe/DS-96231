package com.example.exercicioDTO.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name = "tab_professores")
public class ProfessorEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String nome;

    @Column (nullable = false, unique = true)
    private String email;

    private String disciplina;

    @NotNull
    @Enumerated(EnumType.STRING) // Recomendado para Enums
    @Column(nullable = false)
    private Turno turno;

    @Column (nullable = false, unique = true)
    private String codigoAcesso;

    @Column (nullable = false, length = 18)
    private String senha;

    public ProfessorEntity() {
    }

    public ProfessorEntity(Long id, String nome, String email, String disciplina, Turno turno, String codigoAcesso, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.disciplina = disciplina;
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

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public @NotNull Turno getTurno() {
        return turno;
    }

    public void setTurno(@NotNull Turno turno) {
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
