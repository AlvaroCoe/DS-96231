package com.example.dto_revisao.controller;

import com.example.dto_revisao.dto.UsuarioRequestDTO;
import com.example.dto_revisao.dto.UsuarioResponseDTO;
import com.example.dto_revisao.entity.UsuarioEntity;
import com.example.dto_revisao.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
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
    //LISTAR
    @GetMapping
    public ResponseEntity <List<UsuarioResponseDTO>> Listar (){
        return  ResponseEntity
                .status(HttpStatus.OK)
                .body(service.ListarTodos());
    }
    //ADD
    @PostMapping
    public  ResponseEntity<Map<String, Object>> Salvar (@Valid @RequestBody UsuarioRequestDTO u) {
        service.SalvarUsuario(u);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Usuário cadastrado com sucesso."));
    }
    //ATUALIZAR
    @PutMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> AtualizarUsuario(
            @PathVariable Long id,
            @RequestBody UsuarioEntity usuario) {
        service.AtualizarUsuario(id,usuario);

        return  ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Cadastro do usuário atualizado com sucesso."));
    }
    //DELETAR
    @DeleteMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> DeletarUsuario (@PathVariable Long id) {
        service.excluir(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Usuário deletado com sucesso."));
    }
}