package com.example.exercicioDTO.dto;

import com.example.exercicioDTO.entity.Turno;

public class AlunoResponseDTO {

    private String nome;
    private String curso;
    private Turno turno;


    public AlunoResponseDTO() {
    }

    public AlunoResponseDTO(String nome, String curso, Turno turno) {
        this.nome = nome;
        this.curso = curso;
        this.turno = turno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
