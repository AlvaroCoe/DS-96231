package org.example.atividade1;

public class Main {
    public static void main(String[] args) {

        Processador p1 = new Processador("Ryzen", "Ryzen 5 5700G",
                "4.8");
        Memoria m1 = new Memoria("Sei lá", "Sei lá de novo", "64GB");
        PlacaMae placa = new PlacaMae("Asus", "Sei lá mais uma vez", "DDR4");
        DDA dda = new DDA("Lexar", "SSD", "256GB", "Type C");

        System.out.println(p1.toString());
        System.out.println(m1.toString());
        System.out.println(placa.toString());
        System.out.println(dda.toString());

    }
}
