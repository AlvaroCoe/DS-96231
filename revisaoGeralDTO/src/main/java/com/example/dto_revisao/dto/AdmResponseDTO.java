package com.example.dto_revisao.dto;

public class AdmResponseDTO {

    private String nome;
    private String codigoAcesso;
    private String telefone;

    public AdmResponseDTO() {
    }

    public AdmResponseDTO(String nome, String codigoAcesso, String telefone) {
        this.nome = nome;
        this.codigoAcesso = codigoAcesso;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoAcesso() {
        return codigoAcesso;
    }

    public void setCodigoAcesso(String codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
