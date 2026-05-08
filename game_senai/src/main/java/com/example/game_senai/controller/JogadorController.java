package com.example.game_senai.controller;

import com.example.game_senai.dto.JogadorRequestDTO;
import com.example.game_senai.dto.JogadorResponseDTO;
import com.example.game_senai.entity.JogadorEntity;
import com.example.game_senai.service.JogadorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping ("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorService service;

    // LISTAR
    @GetMapping
    public ResponseEntity <List<JogadorResponseDTO>> Listar () {
    return ResponseEntity
            .status(HttpStatus.OK)
            .body(service.ListarJogador());
    }

    // ADICIONAR
    @PostMapping
    public ResponseEntity <Map<String, Object>> AddJogador (@Valid @RequestBody JogadorRequestDTO j) {
        service.SalvarJogador(j);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Jogador cadastrado com sucesso"));

    }

// ATUALIZAR POR LOGIN

    @PutMapping("/{login}")
public ResponseEntity<Map<String, Object>> AtualizarJogador(
        @PathVariable String login, 
        @RequestBody JogadorEntity jogador) {
    
    service.AtualizarJogadorPorLogin(login, jogador);
    return ResponseEntity.ok(Map.of("Mensagem", "Jogador atualizado com sucesso!"));
}

// DELETAR POR LOGIN

@DeleteMapping("/{login}")
public ResponseEntity<Map<String, Object>> DeletarJogador(@PathVariable String login) {
    service.excluirPorLogin(login);
    return ResponseEntity.ok(Map.of("Mensagem", "Jogador deletado com sucesso!"));
}

}
