package com.example.game_senai.dto;


public class CenarioResponseDTO {

    private String nome;
    private String modo;
    private String periodo;

    public CenarioResponseDTO() {
    }

    public CenarioResponseDTO(String nome, String modo, String periodo) {
        this.nome = nome;
        this.modo = modo;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
