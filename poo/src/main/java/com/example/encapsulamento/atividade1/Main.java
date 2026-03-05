package com.example.encapsulamento.atividade1;

public class Main {
    public static void main(String[] args) {

        Endereco endereco1 = new Endereco("Rua A", "50", "Salvador");
        Cliente cliente1 = new Cliente("Alvaro", 27, endereco1);

        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Cidade: " + cliente1.getEndereco().getCidade());


    }
}
