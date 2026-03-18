package org.example.resultadoProfessor;

public class Main {
    public static void main(String[] args) {

    Motoboy motoboy = new Motoboy("Marcos", "07/06/2006",
            Sexo.MASCULINO,Setor.FINANCEIRO, 1560, "854456254");

    Diretor diretor = new Diretor("Alvaro", "22/01/1999",
            Sexo.MASCULINO,Setor.OPERACOES, 8560);

        System.out.println(motoboy.toString());
        System.out.println(diretor.toString());

        diretor.admitir(motoboy);
        diretor.demitir(motoboy);



    }
}
