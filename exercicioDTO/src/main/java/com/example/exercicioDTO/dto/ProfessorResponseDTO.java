package com.example.exercicioDTO.dto;

import com.example.exercicioDTO.entity.Turno;

public class ProfessorResponseDTO {

    private String nome;
    private String email;
    private Turno turno;
    private String codigoAcesso;

    public ProfessorResponseDTO() {
    }

    public ProfessorResponseDTO(String nome, String email, Turno turno, String codigoAcesso) {
        this.nome = nome;
        this.email = email;
        this.turno = turno;
        this.codigoAcesso = codigoAcesso;
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

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public String getCodigoAcesso() {
        return codigoAcesso;
    }

    public void setCodigoAcesso(String codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
    }
}
