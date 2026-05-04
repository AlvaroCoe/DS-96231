package com.example.dto_revisao.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UsuarioRequestDTO {


    @NotBlank(message = "O nome é Obrigatório!")
    @Size(min = 3, max = 50, message = "O nome deve ter entre 3 a 50 caracteres!")
    private String nome;


    @NotBlank(message = "O email é Obrigatório!")
    @Email(message = "O email deve ser válido!")
    private String email;

    @NotBlank(message = "O número telefônico é Obrigatório!")
    private String telefone;


    @NotBlank(message = "A senha é de uso Obrigatório!")
    @Size (min = 6,max = 18,message = "A senha deve conter entre 6 a 18 caracteres!")
    private String senha;

    public UsuarioRequestDTO() {

    }

    public UsuarioRequestDTO(String nome, String email, String telefone, String senha) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
