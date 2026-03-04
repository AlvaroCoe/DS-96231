package com.example.atividade2;

public class Main {
    public static void main(String[] args) {

        Pet pet1 = new Pet ("Scooby", 5, "Vira-lata");
        Cliente cliente1 = new Cliente("Alvaro", 27, pet1);

        Cliente cliente2 = new Cliente("Guilherme", 20,
                new Pet ("Diana", 6, "gato"));

        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println();
        System.out.println("Nome do Pet: " + cliente1.getPet().getNome());
        System.out.println("Raça: " + cliente1.getPet().getRaca());
        System.out.println("Idade do Pet: " + cliente1.getPet().getIdade());
        System.out.println("Nome do Pet: " + cliente2.getPet().getNome());
        System.out.println("Raça: " + cliente2.getPet().getRaca());
        System.out.println("Idade do Pet: " + cliente2.getPet().getIdade());

    }
}
