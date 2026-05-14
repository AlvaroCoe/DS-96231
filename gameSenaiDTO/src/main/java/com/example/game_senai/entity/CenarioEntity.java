package com.example.game_senai.entity;

import jakarta.persistence.*;
import org.aspectj.bridge.IMessage;

@Entity
@Table (name = "tab_cenarios")
public class CenarioEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String nome;


    @Column (nullable = false)
    private String dificuldade;


    @Column (nullable = false)
    private String modo;


    @Column (nullable = false)
    private String periodo;

    public CenarioEntity() {
    }

    public CenarioEntity(Long id, String nome, String dificuldade, String modo, String periodo) {
        this.id = id;
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.modo = modo;
        this.periodo = periodo;
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

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
