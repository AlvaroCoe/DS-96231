package com.example.game_senai.dto;

public class PersonagemResponseDTO {

    private String nome;
    private String classe;
    private String nivelDeForça;

    public PersonagemResponseDTO() {
    }

    public PersonagemResponseDTO(String nome, String classe, String nivelDeForça) {
        this.nome = nome;
        this.classe = classe;
        this.nivelDeForça = nivelDeForça;
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

    public String getNivelDeForça() {
        return nivelDeForça;
    }

    public void setNivelDeForça(String nivelDeForça) {
        this.nivelDeForça = nivelDeForça;
    }
}
