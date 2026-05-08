package com.example.projetoDTO.controller;

import com.example.projetoDTO.dto.UsuarioRequestDTO;
import com.example.projetoDTO.dto.UsuarioResponseDTO;
import com.example.projetoDTO.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping ("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> Listar () {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.ListarTodos());

    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> Salvar (
            @Valid @RequestBody UsuarioRequestDTO usuarioDTO) {
        service.SalvarUsuario(usuarioDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body((Map.of("Mensagem", "Usuário cadastrado com Sucesso!")));
    }

}
