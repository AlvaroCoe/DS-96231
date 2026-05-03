package com.example.apiRevisao.entity;

public enum Curso {

    ARQUITETURA ("Arquitetura"),
    PSICOLOGIA ("Psicologia"),
    GTI ("Desenvolvimento de Sistemas"),
    DIREITO ("Direito"),
    FISIOTERAPIA ("Fisioterapia");

    private final String texto;

    Curso (String texto) {
        this.texto = texto;

    }

    public String getTexto() {
        return texto;
    }
}
