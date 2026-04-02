package com.example.api.controller;

import com.example.api.model.FornecedorModel;
import com.example.api.repository.FornecedorRepository;
import com.example.api.repository.FuncionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/fornecedores")
public class FornecedoreController {
    @Autowired
    private FornecedorRepository repository;

    @GetMapping
    public List<FornecedorModel> ListarTodosn () {
        return repository.findAll();
    }
    @PostMapping
    public ResponseEntity<FornecedorModel> salvar (@RequestBody FornecedorModel fornecedor) {
        repository.save(fornecedor);
        return ResponseEntity.status(HttpStatus.CREATED).body(fornecedor);
    }

}

