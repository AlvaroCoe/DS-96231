package com.example.enums.relacionamento;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa (1, "Alvaro", 27, "71987331646",
                "alvarocoelho@gmail.com", Sexo.MASCULINO, new Endereco("Rua", "50",
                "Vila Marieta", "40444440", "SSA", UnidadeFederativa.SAO_PAULO));
        System.out.println(pessoa1.toString());

    }

}
