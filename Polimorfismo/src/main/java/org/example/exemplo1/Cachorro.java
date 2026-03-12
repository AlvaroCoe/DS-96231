package org.example.exemplo1;

public class Cachorro implements Animal {
    @Override
    public String emitirSom() { //manter sempre
        return "AuAu";}

    @Override
    public String comer() {
        return "Carne";
    }

    @Override
    public String nome() {
        return "Danilo";
    }
}

