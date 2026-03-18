package org.example.sobrecargaDeMetodos;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora ();
        System.out.println(calc.calcular(1,1));
        System.out.println(calc.calcular(2.5, 5.6));
        System.out.println(calc.calcular("AB","CD"));
    }
}
