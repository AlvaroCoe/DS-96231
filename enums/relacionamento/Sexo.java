package com.example.enums.relacionamento;

public enum Sexo {

    MASCULINO ("Masculino"),
    FEMININO ("Feminino");

    //Escrever

    private String texto;

    //Contrutor

    Sexo(String texto) {
        this.texto = texto;
    }
    //Getter

    public String getTexto() {
        return texto;
    }
}
