package com.example.api0704.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api0704.entity.AlunoEntity;
import com.example.api0704.repository.AlunoRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping ("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository repository;

    @GetMapping
    public List<AlunoEntity> listarTodos() {
        return repository.findAll();
    }
    @PostMapping
    public ResponseEntity <AlunoEntity> gerarLista (@RequestBody AlunoEntity aluno) {
       repository.save(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(aluno);
    }
    

}
