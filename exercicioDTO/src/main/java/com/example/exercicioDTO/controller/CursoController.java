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
                .body(Map.of("Mensagem", "Curso adicionado com sucesso!"));

    }
    @PutMapping("/{sigla}")
    public ResponseEntity<Map<String, Object>> AtualizarCurso(
            @PathVariable String sigla,
            @RequestBody CursoEntity curso) {

        service.AtualizarCurso(sigla, curso);
        return ResponseEntity.ok(Map.of("Mensagem", "Curso atualizado com sucesso!"));
    }


    @DeleteMapping("/{sigla}")
    public ResponseEntity<Map<String, Object>> ExcluirCurso (@PathVariable String sigla) {
        service.excluir(sigla);
        return ResponseEntity.ok(Map.of("Mensagem", "Curso descadastrado com sucesso!"));
    }


}