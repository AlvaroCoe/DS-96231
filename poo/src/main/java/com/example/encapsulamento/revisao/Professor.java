package com.example.encapsulamento.revisao;

public class Professor {

        // atributos, vulgo "variáveis" que pertencem à classe.

    private String nome;
    private String email;
    private String Disciplina;

        // construtor

    public Professor(String nome, String email, String disciplina) {
        this.nome = nome;
        this.email = email;
        Disciplina = disciplina;
    }

        // métodos


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

    public String getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String disciplina) {
        Disciplina = disciplina;
    }
}
