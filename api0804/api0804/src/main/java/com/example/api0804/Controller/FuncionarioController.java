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

import com.example.api0804.Entity.FuncionarioEntity;
import com.example.api0804.Repository.FuncionarioRepository;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository repository; // Mudei o nome para não confundir

    @GetMapping
    public List<FuncionarioEntity> Listar() {
        return repository.findAll(); // O método correto é findAll
    }

    @PostMapping
    public ResponseEntity<Object> AddFuncionario(@RequestBody FuncionarioEntity funcionario) {
        repository.save(funcionario); // Salva o funcionário no banco de dados

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Funcionario cadastrado com sucesso!"));
    }
}
//atualizar com o debaixo

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service; // Injetar o Service em vez do Repository

    @GetMapping
    public List<FuncionarioEntity> Listar() {
        return service.ListarTodos(); // Usar o método do service
    }

    @PostMapping
    public ResponseEntity<Object> AddFuncionario(@RequestBody FuncionarioEntity funcionario) {
        try {
            // Aqui chamamos o service que tem a lógica do CPF
            service.salvarFuncionario(funcionario); 
            
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(Map.of("Mensagem", "Funcionario cadastrado com sucesso!"));
        } catch (IllegalArgumentException e) {
            // Aqui pegamos a mensagem "Funcionario já cadastrado!" que você definiu
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(Map.of("Erro", e.getMessage()));
        }
    }
}
