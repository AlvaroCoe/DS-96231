package com.example.projetoDTO.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UsuarioRequestDTO {
    @NotBlank (message = "O nome é obrigatório.")
    @Size (min = 3, message = "O nome deve ter no mínimo três caracteres.")
    @Size (max = 80, message = "O nome dever ter no máximo oitenta caracteres")
    private String nome;

    @NotBlank (message = "O e-mail é obrigatório.")
    @Email (message = "Deve ser um e-mail válido.")
    private String email;

    @NotBlank (message = "A senha é obrigatória.")
    @Size(min = 6, max = 18, message = "A senha deve ter entre 6 a 18 dígitos.")
    private String senha;

    public UsuarioRequestDTO() {
    }

    public UsuarioRequestDTO(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public @NotBlank(message = "O nome é obrigatório.") @Size(min = 3, message = "O nome deve ter no mínimo três caracteres.") @Size(max = 80, message = "O nome dever ter no máximo oitenta caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório.") @Size(min = 3, message = "O nome deve ter no mínimo três caracteres.") @Size(max = 80, message = "O nome dever ter no máximo oitenta caracteres") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O e-mail é obrigatório.") @Email(message = "Deve ser um e-mail válido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O e-mail é obrigatório.") @Email(message = "Deve ser um e-mail válido.") String email) {
        this.email = email;
    }

    public @NotBlank(message = "A senha é obrigatória.") @Size(min = 6, max = 18, message = "A senha deve ter entre 6 a 18 dígitos.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha é obrigatória.") @Size(min = 6, max = 18, message = "A senha deve ter entre 6 a 18 dígitos.") String senha) {
        this.senha = senha;
    }
}
