package com.example.api0804.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api0804.Entity.ClienteEntity;
import com.example.api0804.Service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public List<ClienteEntity> Listar() {
        return service.ListarTodos();
    }
    
    @PostMapping
    public ResponseEntity<Map<Object, String>> AddCliente(@RequestBody ClienteEntity cliente) {
    service.salvarCliente(cliente);

    return ResponseEntity
    .status(HttpStatus.CREATED)
    .body(Map.of("Menssagem", "Cliente cadastrado com sucesso!"));
    }

}
