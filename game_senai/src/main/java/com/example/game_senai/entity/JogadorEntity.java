package com.example.game_senai.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

@Entity
@Table (name = "tab_jogadores")
public class JogadorEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String nome;


    @Column (nullable = false, unique = true)
    private String email;


    @Column (nullable = false, unique = true, length = 40)
    private String login;


    @Column (nullable = false)
    private String senha;

    public JogadorEntity() {
    }

    public JogadorEntity(Long id, String nome, String email, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
