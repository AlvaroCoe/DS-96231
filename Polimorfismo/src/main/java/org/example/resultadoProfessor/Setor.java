package org.example.resultadoProfessor;

public enum Setor {

    RECURSOS_HUMANOS("Recursos Humanos"),
    FINANCEIRO ("Financeiro"),
    OPERACOES("Operações");

    private String texto;

    Setor(String texto) {
        this.texto = texto;
    }
}