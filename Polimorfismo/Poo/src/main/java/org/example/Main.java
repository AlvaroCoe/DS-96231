package org.example;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("Marcos", "46456", "758746", Sexo.MASCULINO, 1000, "01/01/2001", "20/02/2021", "asdf4545");
        Gerente gerente = new Gerente("Maria", "43213", "321658", Sexo.FEMININO,1000, "02/02/2002", "21/02/2020", Bonificacao.GERENTE);
        Diretor diretor = new Diretor("Marta", "46538","42165", Sexo.FEMININO, 1000, "03/03/2003", "20/05/2020", Bonificacao.DIRETOR);

        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());
        System.out.println(diretor.toString());

        diretor.admitir(motoboy);
        diretor.demitir(gerente);
    }
}