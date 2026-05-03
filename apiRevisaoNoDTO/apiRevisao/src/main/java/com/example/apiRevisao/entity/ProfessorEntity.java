package com.example.apiRevisao.entity;

import jakarta.persistence.*;

@Entity
public class ProfessorEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private Sexo sexo;
    private Turno turno;

    public ProfessorEntity() {
    }

    public ProfessorEntity(Long id, String nome, String email, Sexo sexo, Turno turno) {
        this.id = id;
        this.nome = nome;
        this.email = email;
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
