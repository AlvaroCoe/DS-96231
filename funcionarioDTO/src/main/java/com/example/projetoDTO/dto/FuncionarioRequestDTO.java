package com.example.projetoDTO.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class FuncionarioRequestDTO { //REQUEST - Requisição do "model/Entity".Tudo o que entra.

    @NotBlank(message = "O nome é obrigatório.")
    @Size (max = 200, message = "O nome não pode conter mais de 200 caracteres.")
    @Size (min = 2, message = "O nome não pode conter menos de 2 caracteres.")
    private String nome;

    @NotBlank(message = "O email é obrigatório")
    @Email(message = "Deve ser um e-mail válido.")
    private String email;

    @NotBlank(message = "A senha é obrigatória.")
    @Size (max = 18, message = "A senha não pode conter mais de 18 caracteres.")
    @Size (min = 6, message = "A senha não pode conter menos de 6 caracteres.")
    private String senha;

    @NotBlank(message = "O número telefônico é obrigatório.")
    @Size (max = 13,min = 10, message = "O telefone deve ter entre 10 e 13 dígitos.")
    private String telefone;

    public FuncionarioRequestDTO() {
    }

    public FuncionarioRequestDTO(String nome, String email, String senha, String telefone) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    public @NotBlank(message = "O nome é obrigatório.") @Size(max = 200, message = "O nome não pode conter mais de 200 caracteres.") @Size(min = 2, message = "O nome não pode conter menos de 2 caracteres.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório.") @Size(max = 200, message = "O nome não pode conter mais de 200 caracteres.") @Size(min = 2, message = "O nome não pode conter menos de 2 caracteres.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O email é obrigatório") @Email(message = "Deve ser um e-mail válido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O email é obrigatório") @Email(message = "Deve ser um e-mail válido.") String email) {
        this.email = email;
    }

    public @NotBlank(message = "A senha é obrigatória.") @Size(max = 18, message = "A senha não pode conter mais de 18 caracteres.") @Size(min = 6, message = "A senha não pode conter menos de 6 caracteres.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha é obrigatória.") @Size(max = 18, message = "A senha não pode conter mais de 18 caracteres.") @Size(min = 6, message = "A senha não pode conter menos de 6 caracteres.") String senha) {
        this.senha = senha;
    }

    public @NotBlank(message = "A senha é obrigatória.") @Size(max = 13, min = 10, message = "O telefone deve ter entre 10 e 13 dígitos.") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "A senha é obrigatória.") @Size(max = 13, min = 10, message = "O telefone deve ter entre 10 e 13 dígitos.") String telefone) {
        this.telefone = telefone;
    }
}
