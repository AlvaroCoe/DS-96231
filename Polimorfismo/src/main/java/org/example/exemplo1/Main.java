package org.example.exemplo1;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Galo galo = new Galo();
        Pato pato = new Pato();

        System.out.println(cachorro.emitirSom());
        System.out.println(gato.emitirSom());
        System.out.println(galo.emitirSom());
        System.out.println(pato.emitirSom());

    }

}