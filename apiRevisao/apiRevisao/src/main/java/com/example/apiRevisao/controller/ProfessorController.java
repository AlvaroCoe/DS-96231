package com.example.apiRevisao.controller;

import com.example.apiRevisao.entity.ProfessorEntity;
import com.example.apiRevisao.service.ProfessorService;
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
    private ProfessorService service;
    //LISTAR
    @GetMapping
    public List<ProfessorEntity> ListarPorfessores(){
        return  service.ListarProfessores();
    }
    //ADD
    @PostMapping
    public ResponseEntity<Map<String, Object>> ContratarProfessor (@RequestBody ProfessorEntity professor) {
        service.AddProfessor(professor);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Professor contratado com sucesso."));
    }
    //ATUALIZAR
    @PutMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> AtualizarProfessor (
            @PathVariable Long id,
            @RequestBody ProfessorEntity professor) {
        service.AtualizarProfessor(id,professor);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Professor atualizado com sucesso."));
    }
    //DELETAR
    @DeleteMapping ("{id}")
    public ResponseEntity<Map<String, Object>> DemitirProfessor (@PathVariable Long id) {
        service.excluir(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Professor desligado com sucesso."));
    }


}
