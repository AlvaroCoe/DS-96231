package com.example.encapsulamento;


public class Main {
    public static void main(String[] args) {

    // POO - Programação Orientada a Objetos

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Alvaro");
        cliente1.setIdade(27);

        Pet pet1 = new Pet();
        pet1.setNome("Scooby");
        pet1.setIdade(3);

        Livro livro1 = new Livro();
        livro1.setNome("O iluminado");
        livro1.setPreco(93.98);
        livro1.setPaginas(520);

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Bruno Rosa");
        funcionario1.setCargo("Gerente Júnior");
        funcionario1.setSalario(6.500);
    

        System.out.println("Nome do cliente: " + cliente1.getNome());
        System.out.println("Idade do cliente: " + cliente1.getIdade());
        System.out.println("Nome do Pet: " + pet1.getNome());
        System.out.println("Idade do Pet: " + pet1.getIdade());
        System.out.println("Nome do livro: " + livro1.getNome());
        System.out.println("Preço do livro: " + "R$" + livro1.getPreco());
        System.out.println("Quantidade de páginas: " + livro1.getPaginas());
        System.out.println("Nome do Funcionário: " + funcionario1.getNome());
        System.out.println("Cargo do funcionário: " + funcionario1.getCargo());
        System.out.println("Salário Semanal: " + "R$" + funcionario1.getSalario());

    }
}

