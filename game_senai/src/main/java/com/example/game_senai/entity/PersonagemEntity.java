package com.example.game_senai.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "tab_personagens")
public class PersonagemEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String nome;

    @Column (nullable = false)
    private String classe;

    @Column (nullable = false)
    private String dificuldade;

    @Column (nullable = false, length = 4)
    private String nivelDeForça;

    public PersonagemEntity() {
    }

    public PersonagemEntity(Long id, String nome, String classe, String dificuldade, String nivelDeForça) {
        this.id = id;
        this.nome = nome;
        this.classe = classe;
        this.dificuldade = dificuldade;
        this.nivelDeForça = nivelDeForça;
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

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getNivelDeForça() {
        return nivelDeForça;
    }

    public void setNivelDeForça(String nivelDeForça) {
        this.nivelDeForça = nivelDeForça;
    }
}
