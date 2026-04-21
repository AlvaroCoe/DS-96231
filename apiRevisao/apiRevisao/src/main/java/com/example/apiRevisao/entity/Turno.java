package com.example.apiRevisao.entity;

public enum Turno {

    MATUTINO ("Manhã"),
    VESPERTINO ("Tarde"),
    NOTURNO ("Noite");

    private final String texto;

    Turno(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
