package com.example.dto_revisao.dto;

import com.example.dto_revisao.entity.enuns.Sexo;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class AdmRequestDTO {

    @NotBlank (message = "Digite o seu nome, por favor.")
    private String nome;

    private Sexo sexo;

    @NotBlank (message = "Digite seu email, por favor.")
    @Email (message = "Digite um email válido, por favor.")
    private String email;

    @NotBlank (message = "Precisamos que digite seu número para contato.")
    @Size(min = 11, max = 18, message = "Digite um número de telefone com DDD, por favor.")
    private String telefone;

    @NotBlank (message = "Informe seu código de acesso para acesso ao sistema.")
    private String codigoAcesso;

    @NotBlank (message = "Informe a sua senha.")
    private String senha;

    public AdmRequestDTO() {
    }

    public AdmRequestDTO(String nome, Sexo sexo, String email, String telefone, String codigoAcesso, String senha) {
        this.nome = nome;
        this.sexo = sexo;
        this.email = email;
        this.telefone = telefone;
        this.codigoAcesso = codigoAcesso;
        this.senha = senha;
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
