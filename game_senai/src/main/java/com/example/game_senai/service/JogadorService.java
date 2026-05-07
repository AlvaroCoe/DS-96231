package com.example.game_senai.service;

import com.example.game_senai.dto.JogadorRequestDTO;
import com.example.game_senai.dto.JogadorResponseDTO;
import com.example.game_senai.entity.JogadorEntity;
import com.example.game_senai.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    //LISTAR

    public List<JogadorResponseDTO> ListarJogador() {
        return repository
                .findAll()
                .stream()
                .map(f -> new JogadorResponseDTO(
                        f.getId(),
                        f.getLogin()
                ))
                .toList();
    }

    //ADICIONAR

    public JogadorEntity SalvarJogador(JogadorRequestDTO dto) {
        if (repository.findByLogin(dto.getLogin()).isPresent()
                && repository.findByEmail(dto.getEmail()).isPresent()){
            throw new RuntimeException("Login ou email já em uso!");

        }

        JogadorEntity novoJogador = new JogadorEntity();
        novoJogador.setNome(dto.getNome());
        novoJogador.setEmail(dto.getEmail());
        novoJogador.setLogin(dto.getLogin());
        novoJogador.setSenha(dto.getSenha());

        return repository.save(novoJogador);

    }

    //ATUALIZAR

    public JogadorEntity AtualizarJogador (Long id, JogadorEntity jogador) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Jogador não encontrado");
        }

        jogador.setId(id);
        return repository.save(jogador);

    }

    // DELETAR

    public void excluir (Long id) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Jogador não encontrado!");
        }
        repository.deleteById(id);
    }

}
