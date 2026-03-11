package org.example.atividade3;

public class Main {
    public static void main(String[] args) {

Engenheiro eng = new Engenheiro("Alvaro", "alvaro.coelho@gmail.com", 6899,
        new Endereco("Rua dos bobos", "50", "Vila Marieta", "45455-680",
                "Salvador"), "2255225");
Medico med = new Medico("Gabriela", "falcao.oliveira@yahoo.com.br", 50451.50,
        new Endereco("Rua Mangueira", "24", "Beco de fumo", "12345654",
                "Salvador" ), "6545784532");

        System.out.println(eng.toString());
        System.out.println(med.toString());

    }
}
