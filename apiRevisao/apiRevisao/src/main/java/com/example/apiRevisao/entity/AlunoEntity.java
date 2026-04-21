package com.example.apiRevisao.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "tab_alunos")
public class AlunoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    @Enumerated(EnumType.STRING)
    private Curso curso;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    @Enumerated(EnumType.STRING)
    private Turno turno;

    public AlunoEntity() {
    }

    public AlunoEntity(Long id, String nome, String email, Curso curso, Sexo sexo, Turno turno) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.curso = curso;
        this.sexo = sexo;
        this.turno = turno;
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

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}


