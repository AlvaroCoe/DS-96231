package com.example.projetoDTO.controller;

import com.example.projetoDTO.dto.FuncionarioRequestDTO;
import com.example.projetoDTO.dto.FuncionarioResponseDTO;
import com.example.projetoDTO.service.FuncionarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping ("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @GetMapping
    public ResponseEntity <List<FuncionarioResponseDTO>> Listar (){
        return  ResponseEntity
                .status(HttpStatus.OK)
                .body(service.ListarTodos());
    }

    @PostMapping
    public  ResponseEntity<Map<String, Object>> Salvar (@Valid@RequestBody FuncionarioRequestDTO f) {
        service.SalvarFuncionario(f);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Funcionário cadastrado com sucesso."));
    }
}
