package com.example.encapsulamento;

public class Livro {

    //ATRIBUTOS
    private String título;
    private String Autor;
    private int numeroPaginas;
    private Double preco;

   
    public Livro(String título, String autor, int numeroPaginas, Double preco) {
        this.título = título;
        Autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.preco = preco;
    }


    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    
}

