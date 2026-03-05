package com.example.encapsulamento.atividade3;

public class Main {
    public static void main(String[] args) {

        ContaBancaria contaBancaria1 = new ContaBancaria("Banco do Brasil", "1254",
                "1515", "Corrente", 12.50, 500.00);
        Funcionario funcionario1 = new Funcionario("14A15F", "Guilherme",
                "Fernandez da Cunha", "719978871564", "guizinho123@gmail.com", contaBancaria1);

        System.out.println("Nome do funcionário: " + funcionario1.getNome());
        System.out.println("Código do funcionário: " + funcionario1.getCodigoDoFuncionario());
        System.out.println("Endereço do funcionário: " + funcionario1.getEndereco());
        System.out.println("Telefone do funcionário: " + funcionario1.getTelefone());
        System.out.println("Email do funcionário: "+ funcionario1.getEmail());
        System.out.println();
        System.out.println("Conta do banco: " + funcionario1.getContaBancaria().getBanco());
        System.out.println("Angência do banco: " + funcionario1.getContaBancaria().getAgencia());
        System.out.println("Número do banco: " + funcionario1.getContaBancaria().getNumeroDaConta());
        System.out.println("Tipo de conta: " + funcionario1.getContaBancaria().getTipoDaConta());
        System.out.println("Saldo atual: " + funcionario1.getContaBancaria().getSaldoAtual());
        System.out.println("Limite disponível: " + funcionario1.getContaBancaria().getLimiteDisponivel());


    }
}
