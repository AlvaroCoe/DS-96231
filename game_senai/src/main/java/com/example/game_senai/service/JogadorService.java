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

    // ATUALIZAR POR LOGIN

public JogadorEntity AtualizarJogadorPorLogin(String login, JogadorEntity dadosNovos) {
    JogadorEntity jogadorExistente = repository.findByLogin(login)
            .orElseThrow(() -> new IllegalArgumentException("Jogador com login " + login + " não encontrado"));

    // Mantém o ID original para atualizar o mesmo registro
    dadosNovos.setId(jogadorExistente.getId());
    return repository.save(dadosNovos);
        }

    // DELETAR POR LOGIN

public void excluirPorLogin(String login) {
    if (repository.findByLogin(login).isEmpty()) {
        throw new IllegalArgumentException("Jogador não encontrado com o login: " + login);
        }
    repository.deleteByLogin(login);
    }

}
