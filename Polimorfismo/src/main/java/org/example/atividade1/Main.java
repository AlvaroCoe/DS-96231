package org.example.atividade1;

public class Main {
    public static void main(String[] args) {

        Soma soma = new Soma();
        Subtracao sub = new Subtracao();
        Multiplicacao mult = new Multiplicacao();
        Divisao divi = new Divisao();

        System.out.println("Soma: " + soma.calcular(7,5));
        System.out.println("Subtração: " + sub.calcular(7,5));
        System.out.println("Multiplicação: " + mult.calcular(7,5));
        System.out.println("Divisão: " + divi.calcular(7,5));

    }
}
