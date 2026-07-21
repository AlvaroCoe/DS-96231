package com.example.dto_revisao.controller;

import com.example.dto_revisao.dto.AdmRequestDTO;
import com.example.dto_revisao.dto.AdmResponseDTO;
import com.example.dto_revisao.entity.AdmEntity;
import com.example.dto_revisao.service.AdmService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping ("/adm")
public class AdmController {

    @Autowired
    private AdmService service;
    //LISTAR
    @GetMapping
    public ResponseEntity <List<AdmResponseDTO>> Listar (){
        return  ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listarAdm());
    }
    //ADD
    @PostMapping
    public  ResponseEntity<Map<String, Object>> Salvar (@Valid @RequestBody AdmRequestDTO a) {
        service.criarAdm(a);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Adm cadastrado com sucesso."));
    }
    //ATUALIZAR
    @PutMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> editarAdm (
            @PathVariable Long id,
            @RequestBody AdmEntity adm) {
        service.editarAdm(id,adm);

        return  ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Cadastro do adm atualizado com sucesso."));
    }
    //DELETAR
    @DeleteMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> deletar (@PathVariable Long id) {
        service.deletar(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Adm deletado com sucesso."));
    }
}