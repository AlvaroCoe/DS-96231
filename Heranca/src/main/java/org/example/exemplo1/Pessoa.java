package org.example.exemplo1;

public abstract class Pessoa {  //abstract - "Pessoa" é uma classe que serve como modelo

    protected String nome;
    protected int idade;

    //construtor

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //métodos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //toString

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}

