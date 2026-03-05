package com.example.encapsulamento.atividade1;

public class Endereco {

    //Atributos
    private String logadouro;
    private String numero;
    private String cidade;

    //construtor

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Endereco(String logadouro, String numero, String cidade) {
        this.logadouro = logadouro;
        this.numero = numero;
        this.cidade = cidade;

    }
}

