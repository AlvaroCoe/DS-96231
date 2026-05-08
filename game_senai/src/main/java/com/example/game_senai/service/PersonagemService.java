package com.example.game_senai.service;

import com.example.game_senai.dto.PersonagemRequestDTO;
import com.example.game_senai.dto.PersonagemResponseDTO;
import com.example.game_senai.entity.PersonagemEntity;
import com.example.game_senai.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;

@Service
public class PersonagemService {

    @Autowired
    private PersonagemRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    //LISTAR

    public List<PersonagemResponseDTO> ListarPersonagem() {
        return repository
                .findAll()
                .stream()
                .map(f -> new PersonagemResponseDTO(
                        f.getNome(),
                        f.getClasse(),
                        f.getNivelDeForça()

                ))
                .toList();
    }

    //ADICIONAR

    public PersonagemEntity SalvarPersonagem(PersonagemRequestDTO dto) {
        if (repository.findByNome(dto.getNome()).isPresent()) {
            throw new RuntimeException("Personagem já cadastrado!");
        }

    PersonagemEntity novoPersonagem = new PersonagemEntity();
    novoPersonagem.setNome(dto.getNome());
    novoPersonagem.setClasse(dto.getClasse());
    novoPersonagem.setDificuldade(dto.getDificuldade());
    novoPersonagem.setNivelDeForça(dto.getNivelDeForça());

    return repository.save(novoPersonagem);

}

    // ATUALIZAR POR NOME

public PersonagemEntity AtualizarPersonagemPorNome(String nome, PersonagemEntity personagemNovo) {
    PersonagemEntity existente = repository.findByNome(nome)
            .orElseThrow(() -> new IllegalArgumentException("Personagem não encontrado"));

    personagemNovo.setId(existente.getId());
    return repository.save(personagemNovo);
}

    // DELETAR POR NOME

public void excluirPorNome(String nome) {
    if (repository.findByNome(nome).isEmpty()) {
        throw new IllegalArgumentException("Personagem não encontrado!");
    }
    repository.deleteByNome(nome);
}






}
