package com.example.game_senai.controller;

import com.example.game_senai.dto.PersonagemRequestDTO;
import com.example.game_senai.dto.PersonagemResponseDTO;
import com.example.game_senai.entity.PersonagemEntity;
import com.example.game_senai.service.PersonagemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping ("/personagens")
public class PersonagemController {

    @Autowired
    private PersonagemService service;

    //LISTAR

    @GetMapping
    public ResponseEntity <List<PersonagemResponseDTO>> Listar () {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.ListarPersonagem());
    }

    // ADD
    @PostMapping
    public ResponseEntity<Map<String, Object>> Salvar (@Valid @RequestBody PersonagemRequestDTO p) {
        service.SalvarPersonagem(p);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Personagem cadastrado com sucesso"));

    }

    // ATUALIZAR
    @PutMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> AtualizarPersonagem (
            @PathVariable Long id,
            @RequestBody PersonagemEntity personagem) {
        service.AtualizarPersonagem(id,personagem);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Memsagem", "Personagem atualizado com sucesso!"));

    }

    //DELETAR

    @DeleteMapping ("/{id}")
    public ResponseEntity <Map<String, Object>> DeletarPersonagem (@PathVariable Long id) {
        service.excluir(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Personagem deletado com sucesso!"));
    }

}
