package org.example.exemplo1;

public class Galo implements Animal{
    @Override
    public String emitirSom() {
        return "cock-a-doodle-doo";
    }

    @Override
    public String comer() {
        return "milho";
    }

    @Override
    public String nome() {
        return "Bruno";
    }
}
