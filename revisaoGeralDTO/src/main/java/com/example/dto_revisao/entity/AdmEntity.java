package com.example.dto_revisao.entity;

import com.example.dto_revisao.entity.enuns.Sexo;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

@Entity
public class AdmEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Column(nullable = false, unique = true)
    @Email
    private String email;

    private String telefone;

    @Column(nullable = false, unique = true)
    private String codigoAcesso;

    @Column(nullable = false, length = 20)
    private String senha;

    public AdmEntity() {

    }

    public AdmEntity(Long id, String nome, Sexo sexo, String email, String telefone, String codigoAcesso, String senha) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.email = email;
        this.telefone = telefone;
        this.codigoAcesso = codigoAcesso;
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCodigoAcesso() {
        return codigoAcesso;
    }

    public void setCodigoAcesso(String codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
