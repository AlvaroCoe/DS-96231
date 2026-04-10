package com.example.api0704.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api0704.entity.ProfessorEntity;
import com.example.api0704.repository.ProfessorRepository;


@RestController
@RequestMapping ("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorRepository repository;

    @GetMapping
    public List<ProfessorEntity> listarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity <ProfessorEntity> Salvar (@RequestBody ProfessorEntity professor) {
        repository.save(professor);
        return ResponseEntity.status(HttpStatus.CREATED).body(professor);
    
        }
    
}
