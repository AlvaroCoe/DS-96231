package com.example.exercicioDTO.controller;

import com.example.exercicioDTO.dto.ProfessorRequestDTO;
import com.example.exercicioDTO.dto.ProfessorResponseDTO;
import com.example.exercicioDTO.entity.ProfessorEntity;
import com.example.exercicioDTO.service.ProfessorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping ("/professores")
public class ProfessorController {

    @Autowired
    public ProfessorService service;

    @GetMapping
    public ResponseEntity <List<ProfessorResponseDTO>> Listar () {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.ListarProfessores());
    }

    @PostMapping
    public ResponseEntity <Map<String, Object>> AddProfessor (@Valid @RequestBody ProfessorRequestDTO p) {
        service.AdicionarProfessor(p);
                return ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body(Map.of("Mensagem", "Professor salvo com sucesso!"));

    }

    @PutMapping("/{codigoAcesso}")
    public ResponseEntity<Map<String, Object>> AtualizarProfessor(
            @PathVariable String codigoAcesso,
            @RequestBody ProfessorEntity professor) {

        service.AtualizarProfessor(codigoAcesso, professor);
        return ResponseEntity.ok(Map.of("Mensagem", "Professor atualizado com sucesso!"));
    }


    @DeleteMapping("/{codigoAcesso}")
    public ResponseEntity<Map<String, Object>> ExcluirProfessor (@PathVariable String codigoAcesso) {
        service.excluirPorCA(codigoAcesso);
        return ResponseEntity.ok(Map.of("Mensagem", "Professor descadastrado com sucesso!"));
    }

}
