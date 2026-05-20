package com.example.__dto.service;

import com.example.__dto.dto.ClienteRequestDTO;
import com.example.__dto.dto.ClienteResponseDTO;
import com.example.__dto.entity.ClienteEntity;
import com.example.__dto.repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;


    //LISTAR

    public List<ClienteResponseDTO> ListarCliente () {
        return repository
                .findAll()
                .stream()
                .map(c -> new ClienteResponseDTO(
                        c.getNome(),
                        c.getEmail()
                ))
                .toList();
    }

    //ADICIONAR

    public ClienteEntity AddCliente(@Valid ClienteRequestDTO dto) {
        if (repository.findByEmail(dto.getEmail()).isPresent()){
            throw new RuntimeException("Email já em uso!");

        }

        ClienteEntity novoCliente = new ClienteEntity();
        novoCliente.setNome(dto.getNome());
        novoCliente.setEmail(dto.getEmail());

        return repository.save(novoCliente);

    }

    // ATUALIZAR

    public ClienteEntity AtualizarCliente(String email, ClienteEntity dadosNovos) {
        ClienteEntity clienteExistente = (ClienteEntity) repository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException("Cliente com email " + email + " não encontrado"));

        // Mantém o ID original para atualizar o mesmo registro
        dadosNovos.setId(clienteExistente.getId());
        return repository.save(dadosNovos);
    }

    // DELETAR POR LOGIN

    public void deletarCliente(String email    ) {
        if (repository.findByEmail(email).isEmpty()) {
            throw new IllegalArgumentException("Cliente não encontrado com o email: " + email);
        }
        repository.deleteByEmail(email);
    }

}








