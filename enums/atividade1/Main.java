package com.example.enums.atividade1;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("F2", "Alvaro", 3500, Setor.VENDAS,
                Sexo.MASCULINO, 27);

        System.out.println("Id Funcionário: " + funcionario1.getId());
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salário: " + funcionario1.getSalario());
        System.out.println("Setor: " + funcionario1.getSetor());
        System.out.println("Gênero: " + funcionario1.getSexo());
        System.out.println("Idade: " + funcionario1.getIdade());

//        System.out.println(funcionario1.toString());

    }
}
