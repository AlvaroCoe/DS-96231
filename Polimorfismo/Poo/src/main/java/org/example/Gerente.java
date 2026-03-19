package org.example;

public class Gerente extends CargoDeConfianca {
    public Gerente(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salarioBase, dataNascimento, dataAdmissao, bonificacao);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", salarioFinal='" + this.getSalarioFinal() + '\'' +
                '}';
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase * Bonificacao.GERENTE.getValor();
    }
}
