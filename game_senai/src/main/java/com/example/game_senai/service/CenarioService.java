package com.example.game_senai.service;

import com.example.game_senai.dto.CenarioRequestDTO;
import com.example.game_senai.dto.CenarioResponseDTO;
import com.example.game_senai.dto.JogadorRequestDTO;
import com.example.game_senai.dto.JogadorResponseDTO;
import com.example.game_senai.entity.CenarioEntity;
import com.example.game_senai.entity.JogadorEntity;
import com.example.game_senai.repository.CenarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CenarioService {

    @Autowired
    private CenarioRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    //LISTAR

    public List<CenarioResponseDTO> ListarCenario() {
        return repository
                .findAll()
                .stream()
                .map(c -> new CenarioResponseDTO(
                        c.getNome(),
                        c.getModo(),
                        c.getPeriodo()

                ))
                .toList();
    }

    //ADICIONAR

    public CenarioEntity SalvarCenario(CenarioRequestDTO dto) {
        if (repository.findByNome(dto.getNome()).isPresent()) {
            throw new RuntimeException("Nome já sendo usado!");

        }

        CenarioEntity novoCenario = new CenarioEntity();
        novoCenario.setNome(dto.getNome());
        novoCenario.setDificuldade(dto.getDificuldade());
        novoCenario.setModo(dto.getModo());
        novoCenario.setPeriodo(dto.getPeriodo());

        return repository.save(novoCenario);

    }

    //ATUALIZAR

    public CenarioEntity atualizarPorNome(String nome, CenarioEntity cenarioNovo) {
        // 1. Tenta achar o registro atual pelo nome que veio na URL
        CenarioEntity cenarioExistente = repository.findByNome(nome)
                .orElseThrow(() -> new IllegalArgumentException("Cenário com nome " + nome + " não encontrado"));

        // 2. Pegamos o ID do que já existe e colocamos no objeto novo
        // Isso garante que o Spring faça um UPDATE e não um INSERT
        cenarioNovo.setId(cenarioExistente.getId());

        // 3. Salva o objeto (agora com o ID preenchido internamente)
        return repository.save(cenarioNovo);
    }

    // DELETAR

    public void deletarCenarioPorNome(String nome) {
        // 1. Verifica se o cenário existe
        Optional<CenarioEntity> cenario = repository.findByNome(nome);

        if (cenario.isEmpty()) {
            throw new IllegalArgumentException("Cenário não encontrado com o nome: " + nome);
        }

        // 2. Se chegou aqui, ele existe, então deleta
        repository.deleteByNome(nome);
    }
}

