package org.example.atividade1;

public class Memoria extends Cpu{

    private String capacidadeDeAmarzenamento;

    public Memoria(String marca, String modelo, String capacidadeDeAmarzenamento) {
        super(marca, modelo);
        this.capacidadeDeAmarzenamento = capacidadeDeAmarzenamento;
    }

    public String getCapacidadeDeAmarzenamento() {
        return capacidadeDeAmarzenamento;
    }

    public void setCapacidadeDeAmarzenamento(String capacidadeDeAmarzenamento) {
        this.capacidadeDeAmarzenamento = capacidadeDeAmarzenamento;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidadeDeAmarzenamento='" + capacidadeDeAmarzenamento + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
