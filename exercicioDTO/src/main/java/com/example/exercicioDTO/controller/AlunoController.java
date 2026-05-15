package com.example.exercicioDTO.controller;

import com.example.exercicioDTO.dto.AlunoRequestDTO;
import com.example.exercicioDTO.dto.AlunoResponseDTO;
import com.example.exercicioDTO.entity.AlunoEntity;
import com.example.exercicioDTO.service.AlunoService;
import jakarta.validation.Valid;
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
    public AlunoService service;

    @GetMapping
    public ResponseEntity <List<AlunoResponseDTO>> Listar () {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.ListarAluno());
    }
    @PostMapping
    public ResponseEntity <Map<String, Object>> AddAluno (@Valid @RequestBody AlunoRequestDTO a){
        service.SalvarAluno (a);
                return ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body(Map.of("Mensagem", "Aluno Cadastrado com sucesso!"));

    }
    @PutMapping("/{codigoAcesso}")
    public ResponseEntity<Map<String, Object>> AtualizarAluno(
            @PathVariable String codigoAcesso,
            @RequestBody AlunoUpdateDTO aluno) { //Atualizado de AlunoEntity para AlunoUpdateDTO

        service.AtualizarAlunoCA(codigoAcesso, aluno);
        return ResponseEntity.ok(Map.of("Mensagem", "Aluno atualizado com sucesso!"));
    }


    @DeleteMapping("/{codigoAcesso}")
    public ResponseEntity<Map<String, Object>> ExcluirAluno (@PathVariable String codigoAcesso) {
        service.excluirPorCA(codigoAcesso);
        return ResponseEntity.ok(Map.of("Mensagem", "Aluno descadastrado com sucesso!"));
    }


}
