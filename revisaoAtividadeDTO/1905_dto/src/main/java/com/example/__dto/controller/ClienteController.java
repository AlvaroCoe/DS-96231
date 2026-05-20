package com.example.__dto.controller;

import com.example.__dto.dto.ClienteRequestDTO;
import com.example.__dto.dto.ClienteResponseDTO;
import com.example.__dto.entity.ClienteEntity;
import com.example.__dto.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping ("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    // LISTAR
    @GetMapping
    public ResponseEntity <List<ClienteResponseDTO>> Listar () {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.ListarCliente());
    }

    // ADICIONAR
    @PostMapping
    public ResponseEntity <Map<String, Object>> AddCliente (@Valid @RequestBody ClienteRequestDTO c) {
        service.AddCliente(c);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Cliente cadastrado com sucesso"));

    }

// ATUALIZAR

    @PutMapping("/{email}")
    public ResponseEntity<Map<String, Object>> AtualizarCliente(
            @PathVariable String email,
            @RequestBody ClienteEntity cliente) {

        service.AtualizarCliente(email, cliente);
        return ResponseEntity.ok(Map.of("Mensagem", "Cliente atualizado com sucesso!"));
    }

// DELETAR

    @DeleteMapping("/{email}")
    public ResponseEntity<Map<String, Object>> excluir (@PathVariable String email) {
        service.deletarCliente(email);
        return ResponseEntity.ok(Map.of("Mensagem", "Cliente deletado com sucesso!"));
    }

}
