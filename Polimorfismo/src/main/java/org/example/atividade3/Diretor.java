package org.example.atividade3;

import org.example.resultadoProfessor.Contratacao;
import org.example.resultadoProfessor.Funcionario;
import org.example.resultadoProfessor.Setor;
import org.example.resultadoProfessor.Sexo;

public class Diretor extends org.example.resultadoProfessor.Funcionario implements Contratacao {
    private final double PREMIO = 1.1;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = super.salarioBase;
        salarioFinal += super.salarioBase * this.PREMIO;
        return salarioFinal;
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public void admitir(org.example.resultadoProfessor.Funcionario funcionario) {
        System.out.println("Contratando: " + funcionario.getNome());

    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Desligando: " + funcionario.getNome());

    }

    @Override
    public String toString() {
        return "Diretor{" +
                "PREMIO=" + PREMIO +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + getSalarioBase() +
                '}';
    }
}
