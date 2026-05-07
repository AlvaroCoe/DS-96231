package com.example.game_senai.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class JogadorRequestDTO {


    @NotBlank(message = "Adicione seu nome, por favor!")
    private String nome;


    @NotBlank(message = "Adicione um email, por favor!")
    @Email (message = "Escolha um email válido!")
    private String email;

    @NotBlank (message = "Escolha um Login!")
    @Size(min = 2, max = 40, message = "O nome deve ter entre 2 a 40 caracteres!")
    private String login;


    @NotBlank (message = "Escolha uma Senha!")
    @Size(min = 6, message = "A senha deve conter no mínimo 6 caracteres!")
    private String senha;

    public JogadorRequestDTO() {
    }

    public JogadorRequestDTO(String nome, String email, String login, String senha) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public @NotBlank(message = "Adicione seu nome, por favor!") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Adicione seu nome, por favor!") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Adicione um email, por favor!") @Email(message = "Escolha um email válido!") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Adicione um email, por favor!") @Email(message = "Escolha um email válido!") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Escolha um Login!") @Size(min = 2, max = 40, message = "O nome deve ter entre 2 a 40 caracteres!") String getLogin() {
        return login;
    }

    public void setLogin(@NotBlank(message = "Escolha um Login!") @Size(min = 2, max = 40, message = "O nome deve ter entre 2 a 40 caracteres!") String login) {
        this.login = login;
    }

    public @NotBlank(message = "Escolha uma Senha!") @Size(min = 6, message = "A senha deve conter no mínimo 6 caracteres!") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "Escolha uma Senha!") @Size(min = 6, message = "A senha deve conter no mínimo 6 caracteres!") String senha) {
        this.senha = senha;
    }
}
