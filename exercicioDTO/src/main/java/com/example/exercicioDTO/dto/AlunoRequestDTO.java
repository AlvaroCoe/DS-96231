package com.example.exercicioDTO.dto;

import com.example.exercicioDTO.entity.Turno;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class AlunoRequestDTO {

    @NotBlank (message = "Informe o seu nome, por favor")
    private String nome;

    @NotBlank (message = "Informe seu email, por favor!")
    @Email (message = "Informe um email válido!")
    private String email;

    @NotBlank (message = "Informe qual o seu curso!")
    private String curso;

    @NotNull (message = "Qual o seu turno?")
    private Turno turno;

    @NotBlank (message = "Informe seu código de acesso")
    private String codigoAcesso;

    @NotBlank (message = "Infome a sua senha para acessar o seu portal!")
    @Size (min = 6, max = 18, message = "Informe sua senha!")
    private String senha;

    public AlunoRequestDTO() {
    }

    public AlunoRequestDTO(String nome, String email, String curso, Turno turno, String codigoAcesso, String senha) {
        this.nome = nome;
        this.email = email;
        this.curso = curso;
        this.turno = turno;
        this.codigoAcesso = codigoAcesso;
        this.senha = senha;
    }

    public @NotBlank(message = "Informe o seu nome, por favor") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Informe o seu nome, por favor") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Informe seu email, por favor!") @Email(message = "Informe um email válido!") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Informe seu email, por favor!") @Email(message = "Informe um email válido!") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Informe qual o seu curso!") String getCurso() {
        return curso;
    }

    public void setCurso(@NotBlank(message = "Informe qual o seu curso!") String curso) {
        this.curso = curso;
    }

    public @NotNull(message = "Qual o seu turno?") Turno getTurno() {
        return turno;
    }

    public void setTurno(@NotNull(message = "Qual o seu turno?") Turno turno) {
        this.turno = turno;
    }

    public @NotBlank(message = "Informe seu código de acesso") String getCodigoAcesso() {
        return codigoAcesso;
    }

    public void setCodigoAcesso(@NotBlank(message = "Informe seu código de acesso") String codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
    }

    public @NotBlank(message = "Infome a sua senha para acessar o seu portal!") @Size(min = 6, max = 18, message = "Informe sua senha!") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "Infome a sua senha para acessar o seu portal!") @Size(min = 6, max = 18, message = "Informe sua senha!") String senha) {
        this.senha = senha;
    }
}
