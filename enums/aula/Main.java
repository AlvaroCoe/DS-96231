package com.example.enums.aula;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Alvaro", Pedido.ABERTO);
        Cliente cliente2 = new Cliente("Bruno Rosa", Pedido.CANCELADO);

//        System.out.println(cliente1.toString());
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Pedido: " + cliente1.getPedido());
        System.out.println();
        System.out.println("Nome2: " + cliente2.getNome());
        System.out.println("Pedido2: " + cliente2.getPedido());

    }
}
