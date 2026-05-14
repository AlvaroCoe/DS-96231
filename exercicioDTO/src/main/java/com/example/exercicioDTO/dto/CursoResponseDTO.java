package com.example.exercicioDTO.dto;

import com.example.exercicioDTO.entity.Turno;

public class CursoResponseDTO {

    private String nome;
    private String sigla;
    private Turno turno;
    private double valor;

    public CursoResponseDTO() {
    }

    public CursoResponseDTO(String nome, String sigla, Turno turno, double valor) {
        this.nome = nome;
        this.sigla = sigla;
        this.turno = turno;
        this.valor = valor;
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

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
