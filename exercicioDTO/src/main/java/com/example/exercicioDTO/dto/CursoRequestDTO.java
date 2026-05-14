package com.example.exercicioDTO.dto;

import com.example.exercicioDTO.entity.Turno;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CursoRequestDTO {

    @NotBlank (message = "Favor, informe o nome do curso!")
    private String nome;

    @NotBlank (message = "Favor, informe a sigla do curso desejado!")
    private String sigla;

    private String setor;

    @NotNull (message = "Qual turno deseja cursar!")
    private Turno turno;

    private double valor;

    public CursoRequestDTO() {
    }

    public CursoRequestDTO(String nome, String sigla, String setor, Turno turno, double valor) {
        this.nome = nome;
        this.sigla = sigla;
        this.setor = setor;
        this.turno = turno;
        this.valor = valor;
    }

    public @NotBlank(message = "Favor, informe o nome do curso!") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Favor, informe o nome do curso!") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Favor, informe a sigla do curso desejado!") String getSigla() {
        return sigla;
    }

    public void setSigla(@NotBlank(message = "Favor, informe a sigla do curso desejado!") String sigla) {
        this.sigla = sigla;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public @NotNull(message = "Qual turno deseja cursar!") Turno getTurno() {
        return turno;
    }

    public void setTurno(@NotNull(message = "Qual turno deseja cursar!") Turno turno) {
        this.turno = turno;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
