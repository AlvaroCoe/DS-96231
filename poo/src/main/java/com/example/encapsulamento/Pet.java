package com.example.encapsulamento;

public class Pet {

    // ATRIBUTOS DA CLASSE

    private String nome;
    private int idade;
    private String raca;
    private String Cor;
    private String porte;

    //Contrutor

    public Pet(String nome, int idade, String raca, String cor, String porte) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        Cor = cor;
        this.porte = porte;
    }

    //Métodos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
   

    
    
  
}
