package com.example.enums.aula;

public class Cliente {

    private String nome;
    private Pedido pedido;

    public Cliente(String nome, Pedido pedido) {
        this.nome = nome;
        this.pedido = pedido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    }

