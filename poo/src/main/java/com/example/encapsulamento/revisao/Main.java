package com.example.encapsulamento.revisao;

public class Main {

    public static void main(String[] args) {

        // Instanciar a classe professor

        Professor professor1 = new Professor("Danilo", "dandan@gmail.com", "Desenvolvimento de Sistemas");
        Professor professor2 = new Professor("Guilherme", "guigui@gmail.com", "Lógica da programação");
        Professor professor3 = new Professor("Bruno Rosa", "rosinha@gmail.com", "Banco de Dados");

        System.out.println("Nome: " + professor1.getNome());
        System.out.println("Email: " + professor1.getEmail());
        System.out.println("Nome: " + professor1.getDisciplina());
        System.out.println();
        System.out.println("Nome: " + professor2.getNome());
        System.out.println("Email: " + professor2.getEmail());
        System.out.println("Nome: " + professor2.getDisciplina());
        System.out.println();
        System.out.println("Nome: " + professor3.getNome());
        System.out.println("Email: " + professor3.getEmail());
        System.out.println("Nome: " + professor3.getDisciplina());


    }

}
