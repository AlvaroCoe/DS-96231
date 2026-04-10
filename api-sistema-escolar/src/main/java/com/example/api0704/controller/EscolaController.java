package com.example.api0704.controller;

import com.example.api0704.repository.AlunoRepository;
import com.example.api0704.repository.EscolaRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api0704.entity.EscolaEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/escolas")
public class EscolaController {

    private final AlunoRepository alunoRepository;
    @Autowired
    private EscolaRepository repository;

    EscolaController(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @GetMapping
    public List<EscolaEntity> listarTodos() {
        return repository.findAll();
    }
  
    @PostMapping
    public ResponseEntity <EscolaEntity> Salvar (@RequestBody EscolaEntity escola){
        repository.save(escola);
        return ResponseEntity.status (HttpStatus.CREATED).body(escola);
    }
}
