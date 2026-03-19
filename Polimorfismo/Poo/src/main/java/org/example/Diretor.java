package org.example;

public class Diretor extends CargoDeConfianca implements Contratacao {
    private final double PREMIO = 1.1;

    public Diretor(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salarioBase, dataNascimento, dataAdmissao, bonificacao);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "PREMIO=" + PREMIO +
                ", bonificacao=" + bonificacao +
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
    public void admitir(Funcionario funcionario) {
        System.out.println("Contratando: " + funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Desligando: " + funcionario.getNome());
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = super.salarioBase;
        salarioFinal *= Bonificacao.DIRETOR.getValor();
        salarioFinal *= this.PREMIO;
        return salarioFinal;
    }
}
