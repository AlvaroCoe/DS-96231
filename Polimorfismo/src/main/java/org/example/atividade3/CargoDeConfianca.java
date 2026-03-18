package org.example.atividade3;

public abstract class CargoDeConfianca extends Funcionario { //construtor e getter e setter somente
    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, String dataNascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimento, salarioBase);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
}
