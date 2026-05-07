package com.example.game_senai.dto;

import jakarta.validation.constraints.NotBlank;

public class CenarioRequestDTO {


    @NotBlank (message = "Qual o nome do cenário?")
    private String nome;


    @NotBlank (message = "Qual a dificuldade do Mapa?")
    private String dificuldade;


    @NotBlank (message = "Qual o modo do Mapa?")
    private String modo;


    @NotBlank (message = "Matutino, Vespertino ou Noturno?")
    private String periodo;

    public CenarioRequestDTO() {
    }

    public CenarioRequestDTO(String nome, String dificuldade, String modo, String periodo) {
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.modo = modo;
        this.periodo = periodo;
    }

    public @NotBlank(message = "Qual o nome do cenário?") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Qual o nome do cenário?") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Qual a dificuldade do Mapa?") String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(@NotBlank(message = "Qual a dificuldade do Mapa?") String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public @NotBlank(message = "Qual o modo do Mapa?") String getModo() {
        return modo;
    }

    public void setModo(@NotBlank(message = "Qual o modo do Mapa?") String modo) {
        this.modo = modo;
    }

    public @NotBlank(message = "Matutino, Vespertino ou Noturno?") String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(@NotBlank(message = "Matutino, Vespertino ou Noturno?") String periodo) {
        this.periodo = periodo;
    }
}
