package com.example.apiRevisao.controller;

import com.example.apiRevisao.entity.AlunoEntity;
import com.example.apiRevisao.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping ("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService service;
    //LISTAR
    @GetMapping
    public List<AlunoEntity> ListarAlunos() {
        return service.ListarAlunos();
    }
    //ADICIONAR
    @PostMapping
    public ResponseEntity<Map<String, Object>> MatricularAluno (@RequestBody AlunoEntity aluno) {
        service.AddAluno(aluno);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Aluno Matriculado com sucesso."));
    }
    //ATUALIZAR
    @PutMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> AtualizarAluno(
            @PathVariable Long id,
            @RequestBody AlunoEntity aluno) {
        service.AtualizarAluno(id,aluno);

        return  ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Aluno atualizado com sucesso."));
    }
    //DELETAR
    @DeleteMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> DesmatricularAluno (@PathVariable Long id) {
        service.excluir(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Aluno desmatriculado com sucesso."));
    }

}
