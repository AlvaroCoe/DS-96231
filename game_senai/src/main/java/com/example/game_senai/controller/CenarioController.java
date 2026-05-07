package com.example.game_senai.controller;

import com.example.game_senai.dto.CenarioRequestDTO;
import com.example.game_senai.dto.CenarioResponseDTO;
import com.example.game_senai.dto.JogadorRequestDTO;
import com.example.game_senai.dto.JogadorResponseDTO;
import com.example.game_senai.entity.CenarioEntity;
import com.example.game_senai.entity.JogadorEntity;
import com.example.game_senai.service.CenarioService;
import com.example.game_senai.service.JogadorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping ("/cenarios")
public class CenarioController {

    @Autowired
    private CenarioService service;

    // LISTAR
    @GetMapping
    public ResponseEntity <List<CenarioResponseDTO>> Listar () {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.ListarCenario());
    }

    // ADICIONAR
    @PostMapping
    public ResponseEntity <Map<String, Object>> AddCenario (@Valid @RequestBody CenarioRequestDTO c) {
        service.SalvarCenario(c);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Cenário cadastrado com sucesso"));

    }

    // ATUALIZAR PELO NOME
    @PutMapping("/{nome}") // 1. Troque de {id} para {nome}
    public ResponseEntity<Map<String, Object>> AtualizarCenario (
            @PathVariable String nome, // 2. Troque de Long id para String nome
            @RequestBody CenarioEntity cenario) {

        // 3. Passe o nome para o seu novo método do service
        service.atualizarPorNome(nome, cenario);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Cenário atualizado com sucesso!"));
    }

    //DELETAR

    @DeleteMapping("/{nome}")
    public ResponseEntity<Map<String, Object>> deletarCenario(@PathVariable String nome) {

        service.deletarCenarioPorNome(nome);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Cenário deletado com sucesso!"));
    }
}

