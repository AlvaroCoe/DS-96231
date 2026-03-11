package org.example.exemplo1;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gabrielle", 19, "10/03/2026", "parceladíssimo");
        Funcionario funcionario1 = new Funcionario("Danilo", 23, "016.599234",
                "Consultor de Vendas", 4500);

        System.out.println(cliente1.toString());
        System.out.println(funcionario1.toString());

        }
        
    }
