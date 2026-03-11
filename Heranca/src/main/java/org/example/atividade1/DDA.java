package org.example.atividade1;

public class DDA extends Cpu{

    private String capacidadeArmazenamento;
    private String tipoConexao;

    public DDA(String marca, String modelo, String capacidadeArmazenamento, String tipoConexao) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.tipoConexao = tipoConexao;
    }

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    @Override
    public String toString() {
        return "DDA{" +
                "capacidadeArmazenamento='" + capacidadeArmazenamento + '\'' +
                ", tipoConexao='" + tipoConexao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
