package com.example.encapsulamento;

public class Main {
    public static void main(String[] args) {

    // POO - Programação Orientada a Objetos

        //Instanciar código

        Cliente cliente1 = new  Cliente("Alvaro Coelho", 27, "861.343.445-24", "alvarodlcoelho@gmail.com", "(71) 9 8733-1646");
        // cliente1.setNome("Alvaro");
        // cliente1.setIdade(27);
        System.out.println("Nome do cliente: " + cliente1.getNome());
        System.out.println("Idade do cliente: " + cliente1.getIdade());
        System.out.println("Número de CPF: " + cliente1.getCpf());
        System.out.println("Endereço: " + cliente1.getEndereco());
        System.out.println("Telefone: " + cliente1.getTelefone());
        System.out.println("-------------------------------------------------------");

        Pet pet1 = new Pet("Scooby", 3, "Vira-lata", "Caramelo", "Médio");
        // pet1.setNome("Scooby");
        // pet1.setIdade(3);
        System.out.println("Nome do Pet: " + pet1.getNome());
        System.out.println("Idade do Pet: " + pet1.getIdade());
        System.out.println("Raça do Pet: " + pet1.getRaca());
        System.out.println("Cor do Pet: " + pet1.getCor());
        System.out.println("Porte do Pet: " + pet1.getPorte());
        System.out.println("--------------------------------------------------------");

        Livro livro1 = new Livro("O iluminado", "Stephen King", 520, 98.90);
        // livro1.setNome("O iluminado");
        // livro1.setPreco(93.98);
        // livro1.setPaginas(520);
        System.out.println("Nome do livro: " + livro1.getTítulo());
        System.out.println("Preço do livro: " + livro1.getAutor());
        System.out.println("Quantidade de páginas: " + livro1.getNumeroPaginas());
        System.out.println("Quantidade de páginas: " + livro1.getPreco() + "R$");
        System.out.println("-------------------------------------------------------");

        Funcionario funcionario1 = new Funcionario("Bruno Rosa", "Gerente Júnior", 6500.00);
        // funcionario1.setNome("Bruno Rosa");
        // funcionario1.setCargo("Gerente Júnior");
        // funcionario1.setSalario(6.500);

        System.out.println("Nome do Funcionário: " + funcionario1.getNome());
        System.out.println("Cargo do funcionário: " + funcionario1.getCargo());
        System.out.println("Salário Semanal: " + "R$" + funcionario1.getSalario());
        System.out.println("--------------------------------------------------------");

        Aluno aluno1 = new Aluno ("Alvaro Coelho", "alvaro.coelho@gmail.com");

        System.out.println("Nome do Aluno: " + aluno1.getNome());
        System.out.println("Nome do Aluno: " + aluno1.getEmail());
        System.out.println("---------------------------------------------------------");

        Veiculo veiculo1 = new Veiculo ("HHN-4D17", "Prata", 4, 45.0, 200, 12.0);

        System.out.println("Placa do carro: " + veiculo1.getPlaca());
        System.out.println("Cor do carro: " + veiculo1.getCor());
        System.out.println("Quantidade de passageiros: " + veiculo1.getQuantidadePassageiros());
        System.out.println("Capacidade de tanque " + veiculo1.getCapacidadeTanque() + "l");
        System.out.println("Velocidade máxima: " + veiculo1.getVelocidadeMaxima() + "Km/h");
        System.out.println("Consumo médio: " + veiculo1.getConsumoMedio() + "Km/l");

    }
}

