package com.example.encapsulamento;

public class Aluno {

    //ATRIBUTOS

    private String nome;
    private String email;
   // private String Turma;
   // private String Curso;
    
    //CONSTRUTORES

    public Aluno(String nome, String email) {
        this.nome = nome;
        this.email = email;

    }

    //MÉTODOS

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
