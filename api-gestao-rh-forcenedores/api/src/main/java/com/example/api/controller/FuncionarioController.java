package com.example.api.controller;

import com.example.api.model.FuncionarioModel;
import com.example.api.repository.FuncionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionaryRepository repository;

    @GetMapping
    public List<FuncionarioModel> listarTodos( ) {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<FuncionarioModel> salvar (@RequestBody FuncionarioModel funcionario){
        // Salva os dados do novo funcinario no banco de dados
        repository.save(funcionario);

        // Retorna um código de status 201 e os dados cadastrados no banco de dados.
        return ResponseEntity.status(HttpStatus.CREATED).body (funcionario);
    }

}
