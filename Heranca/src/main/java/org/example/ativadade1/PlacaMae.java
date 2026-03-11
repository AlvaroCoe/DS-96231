package org.example.ativadade1;

public class PlacaMae extends Cpu{

    private String Soquete;

    public PlacaMae(String marca, String modelo, String soquete) {
        super(marca, modelo);
        Soquete = soquete;
    }

    public String getSoquete() {
        return Soquete;
    }

    public void setSoquete(String soquete) {
        Soquete = soquete;
    }

    @Override
    public String toString() {
        return "PlacaMae{" +
                "Soquete='" + Soquete + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
