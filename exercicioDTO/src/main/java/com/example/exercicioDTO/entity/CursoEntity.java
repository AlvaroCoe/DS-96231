package com.example.exercicioDTO.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class CursoEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false, unique = true)
    private String nome;

    private String sigla;

    @Column (nullable = false)
    private String setor;

    @NotNull
    @Enumerated (EnumType.STRING)
    @Column (nullable = false)
    private Turno turno;

    @Column (nullable = false)
    private double valor;

    public CursoEntity() {
    }

    public CursoEntity(Long id, String nome, String sigla, String setor, Turno turno, double valor) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
        this.setor = setor;
        this.turno = turno;
        this.valor = valor;
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public @NotNull Turno getTurno() {
        return turno;
    }

    public void setTurno(@NotNull Turno turno) {
        this.turno = turno;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
