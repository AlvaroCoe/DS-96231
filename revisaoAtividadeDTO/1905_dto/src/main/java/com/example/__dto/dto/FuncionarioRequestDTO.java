package com.example.__dto.dto;

import com.example.__dto.entity.Endereco;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class FuncionarioRequestDTO {

    @NotBlank(message = "Nome precisa ser preenchido!")
    private String nome;

    @NotBlank(message = "Matricula precisa ser preenchida!")
    private String matricula;

    private String dataNascimento;

    private double salario;

    @NotBlank(message = "Email precisa ser preenchido!")
    @Email(message = "Por favor, informe um email válido!")
    private String email;

    private Endereco endereco;

    public FuncionarioRequestDTO() {
    }

    public FuncionarioRequestDTO(String nome, String matricula, String dataNascimento, double salario, String email, Endereco endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.email = email;
        this.endereco = endereco;
    }

    public @NotBlank(message = "Nome precisa ser preenchido!") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome precisa ser preenchido!") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Matricula precisa ser preenchida!") String getMatricula() {
        return matricula;
    }

    public void setMatricula(@NotBlank(message = "Matricula precisa ser preenchida!") String matricula) {
        this.matricula = matricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public @NotBlank(message = "Email precisa ser preenchido!") @Email(message = "Por favor, informe um email válido!") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email precisa ser preenchido!") @Email(message = "Por favor, informe um email válido!") String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
