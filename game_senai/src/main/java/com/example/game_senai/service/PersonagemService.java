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

    //ATUALIZAR

    public PersonagemEntity AtualizarPersonagem (Long id, PersonagemEntity personagem) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Personagem não encontrado!");
        }

        personagem.setId(id);
        return repository.save(personagem);

    }

    // DELETAR

    public void excluir (Long id) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Personagem não encontrado!");
        }
        repository.deleteById(id);
    }






}
