package com.example.game_senai.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PersonagemRequestDTO {

    @NotBlank (message = "Escolha seu nome, por favor!")
    @Size (min = 3, max = 40, message = "O nome deve ter entre 3 a 40 caracteres!")
    private String nome;

    @NotBlank (message = "Defina a classe de seu personagem!")
    private String classe;

    @NotBlank (message = "Defina a dificuldade entre fácil, médio, difícil")
    private String dificuldade;

    @NotBlank (message = "Defina o nível de força de seu personagem!")
    @Size (min =  3, max = 4, message = "O nivel de força de seu personagem deve ser entre 100 e 9999")
    private String nivelDeForça;

    public PersonagemRequestDTO() {
    }

    public PersonagemRequestDTO(String nome, String classe, String dificuldade, String nivelDeForça) {
        this.nome = nome;
        this.classe = classe;
        this.dificuldade = dificuldade;
        this.nivelDeForça = nivelDeForça;
    }

    public @NotBlank(message = "Escolha seu nome, por favor!") @Size(min = 3, max = 40, message = "O nome deve ter entre 3 a 40 caracteres!") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Escolha seu nome, por favor!") @Size(min = 3, max = 40, message = "O nome deve ter entre 3 a 40 caracteres!") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Defina a classe de seu personagem!") String getClasse() {
        return classe;
    }

    public void setClasse(@NotBlank(message = "Defina a classe de seu personagem!") String classe) {
        this.classe = classe;
    }

    public @NotBlank(message = "Defina a dificuldade entre fácil, médio, difícil") String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(@NotBlank(message = "Defina a dificuldade entre fácil, médio, difícil") String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public @NotBlank(message = "Defina a dificuldade entre fácil, médio, difícil") @Size(min = 3, max = 4, message = "O nivel de força de seu personagem deve ser entre 100 e 9999") String getNivelDeForça() {
        return nivelDeForça;
    }

    public void setNivelDeForça(@NotBlank(message = "Defina a dificuldade entre fácil, médio, difícil") @Size(min = 3, max = 4, message = "O nivel de força de seu personagem deve ser entre 100 e 9999") String nivelDeForça) {
        this.nivelDeForça = nivelDeForça;
    }
}
