package com.example.encapsulamento;

public class Veiculo {

    //ATRIBUTOS
    private String placa;
    private String cor;
    private int quantidadePassageiros;
    private Double capacidadeTanque;
    private int velocidadeMaxima;
    private Double consumoMedio;

    //CONSTRUTOR
    
    public Veiculo(String placa, String cor, int quantidadePassageiros, Double capacidadeTanque, int velocidadeMaxima,
            Double consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.quantidadePassageiros = quantidadePassageiros;
        this.capacidadeTanque = capacidadeTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedio = consumoMedio;
    }

    // METODOS GET E SET
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public Double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(Double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(Double consumoMedio) {
        this.consumoMedio = consumoMedio;
    } 

}
