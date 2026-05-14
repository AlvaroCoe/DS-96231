package com.example.exercicioDTO.dto;

import com.example.exercicioDTO.entity.Turno;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ProfessorRequestDTO {

    @NotBlank (message = "Nome precisa ser cadastrado!")
    private String nome;

    @NotBlank (message = "Email precisa ser cadastrado!")
    @Email (message = "Por favor, insira um email válido!")
    private String email;

    @NotBlank (message = "Qual é a sua disciplina?")
    private String disciplina;

    @NotNull (message = "Qual é o seu turno?")
    private Turno turno;

    @NotBlank (message = "Código de Acesso precisa ser cadastrado!")
    private String codigoAcesso;

    @NotBlank (message = "Favor, insira sua senha!")
    @Size (min = 6, max = 18, message = "Sua senha deve conter entre 6 e 18 caracteres!")
    private String senha;

    public ProfessorRequestDTO() {
    }

    public ProfessorRequestDTO(String nome, String email, String disciplina, Turno turno, String codigoAcesso, String senha) {
        this.nome = nome;
        this.email = email;
        this.disciplina = disciplina;
        this.turno = turno;
        this.codigoAcesso = codigoAcesso;
        this.senha = senha;
    }

    public @NotBlank(message = "Nome precisa ser cadastrado!") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome precisa ser cadastrado!") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Email precisa ser cadastrado!") @Email(message = "Por favor, insira um email válido!") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email precisa ser cadastrado!") @Email(message = "Por favor, insira um email válido!") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Qual é a sua disciplina?") String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(@NotBlank(message = "Qual é a sua disciplina?") String disciplina) {
        this.disciplina = disciplina;
    }

    public @NotNull(message = "Qual é o seu turno?") Turno getTurno() {
        return turno;
    }

    public void setTurno(@NotNull(message = "Qual é o seu turno?") Turno turno) {
        this.turno = turno;
    }

    public @NotBlank(message = "Código de Acesso precisa ser cadastrado!") String getCodigoAcesso() {
        return codigoAcesso;
    }

    public void setCodigoAcesso(@NotBlank(message = "Código de Acesso precisa ser cadastrado!") String codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
    }

    public @NotBlank(message = "Favor, insira sua senha!") @Size(min = 6, max = 18, message = "Sua senha deve conter entre 6 e 18 caracteres!") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "Favor, insira sua senha!") @Size(min = 6, max = 18, message = "Sua senha deve conter entre 6 e 18 caracteres!") String senha) {
        this.senha = senha;
    }
}
