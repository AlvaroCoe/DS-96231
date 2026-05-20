package com.example.__dto.dto;

import com.example.__dto.entity.Endereco;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class ClienteRequestDTO {

    @NotBlank (message = "Nome precisa ser preenchido!")
    private String nome;

    @NotBlank (message = "Email precisa ser preenchido!")
    @Email (message = "Por favor, informe um email válido!")
    private String email;

    private Endereco endereco;

    public ClienteRequestDTO() {
    }

    public ClienteRequestDTO(String nome, String email, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
