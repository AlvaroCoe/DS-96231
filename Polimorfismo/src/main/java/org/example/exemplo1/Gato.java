package org.example.exemplo1;

public class Gato implements Animal {

    @Override
    public String emitirSom() {
        return "Minhauu";
    }

    @Override
    public String comer() {
        return "Whiskas";
    }

    @Override
    public String nome() {
        return "Alvaro";
    }
}
