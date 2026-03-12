package org.example.exemplo1;

public class Pato implements Animal{
    @Override
    public String emitirSom() {
        return "Quack";
    }

    @Override
    public String comer() {
        return "plantas aquáticas";
    }

    @Override
    public String nome() {
        return "Gabi";
    }
}
