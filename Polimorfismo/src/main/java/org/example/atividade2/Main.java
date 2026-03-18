package org.example.atividade2;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Camilla", "54684747715", "07/06/2006",
                5400, Bonificacao.GERENTE);
        Motoboy motoboy = new Motoboy("Geovane", "45678912345", "20/11/1895",
                1666, "FGD-1545");

        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());

        gerente.demitir (motoboy);


    }
}
