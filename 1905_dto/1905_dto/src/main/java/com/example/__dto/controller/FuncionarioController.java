package com.example.__dto.controller;

import com.example.__dto.dto.ClienteResponseDTO;
import com.example.__dto.dto.FuncionarioRequestDTO;
import com.example.__dto.dto.FuncionarioResponseDTO;
import com.example.__dto.entity.ClienteEntity;
import com.example.__dto.entity.FuncionarioEntity;
import com.example.__dto.service.ClienteService;
import com.example.__dto.service.FuncionarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping ("/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    // LISTAR
    @GetMapping
    public ResponseEntity <List<FuncionarioResponseDTO>> Listar () {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.ListarFuncionario());
    }

    // ADICIONAR
    @PostMapping
    public ResponseEntity <Map<String, Object>> AddFuncionario (@Valid @RequestBody FuncionarioRequestDTO f) {
        service.AddFuncionario(f);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Funcionário cadastrado com sucesso"));

    }

// ATUALIZAR

    @PutMapping("/{email}")
    public ResponseEntity<Map<String, Object>> AtualizarFuncionario(
            @PathVariable String email,
            @RequestBody FuncionarioEntity funcionario) {

        service.AtualizarFuncionario(email, funcionario);
        return ResponseEntity.ok(Map.of("Mensagem", "Funcionário atualizado com sucesso!"));
    }

// DELETAR

    @DeleteMapping("/{email}")
    public ResponseEntity<Map<String, Object>> excluir (@PathVariable String email) {
        service.deletarFuncionario(email);
        return ResponseEntity.ok(Map.of("Mensagem", "Cliente deletado com sucesso!"));
    }

}
