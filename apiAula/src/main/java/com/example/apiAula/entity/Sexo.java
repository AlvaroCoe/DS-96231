package com.example.apiAula.entity;

public enum Sexo {

    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private final String texto;

    Sexo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}