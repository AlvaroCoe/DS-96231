package com.example.exercicioDTO.controller;

import com.example.exercicioDTO.dto.AlunoRequestDTO;
import com.example.exercicioDTO.dto.AlunoResponseDTO;
import com.example.exercicioDTO.dto.CursoRequestDTO;
import com.example.exercicioDTO.dto.CursoResponseDTO;
import com.example.exercicioDTO.entity.AlunoEntity;
import com.example.exercicioDTO.service.AlunoService;
import com.example.exercicioDTO.service.CursoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping ("/Cursos")
public class CursoController {

    @Autowired
    public CursoService service;

    @GetMapping
    public ResponseEntity <List<CursoResponseDTO>> Listar () {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.ListarCurso());
    }
    @PostMapping
    public ResponseEntity <Map<String, Object>> AddCurso (@Valid @RequestBody CursoRequestDTO c){
        service.SalvarCurso (c);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Aluno Cadastrado com sucesso!"));

    }
    @PutMapping("/{codigoAcesso}")
    public ResponseEntity<Map<String, Object>> AtualizarAluno(
            @PathVariable String codigoAcesso,
            @RequestBody AlunoEntity aluno) {

        service.AtualizarAlunoCA(codigoAcesso, aluno);
        return ResponseEntity.ok(Map.of("Mensagem", "Aluno atualizado com sucesso!"));
    }


    @DeleteMapping("/{codigoAcesso}")
    public ResponseEntity<Map<String, Object>> ExcluirAluno (@PathVariable String codigoAcesso) {
        service.excluirPorCA(codigoAcesso);
        return ResponseEntity.ok(Map.of("Mensagem", "Aluno descadastrado com sucesso!"));
    }


}