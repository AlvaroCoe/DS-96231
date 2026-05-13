package com.example.exercicioDTO.entity;

public enum Turno {

    MATUTINO ("Matutino"),
    VESPERTINO ("Vespertino"),
    NOTURNO ("Noturno");

    private final String texto;

    Turno(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
