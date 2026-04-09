package com.example.api0804.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api0804.Entity.ClienteEntity;
import com.example.api0804.Repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<ClienteEntity> ListarTodos(){
    return repository.findAll();

}
    public ClienteEntity salvarCliente (ClienteEntity cliente) {
        if (repository.findByemail(cliente.getEmail()).isPresent()){
            throw new IllegalArgumentException("Cliente já cadastrado!");
        }
        return repository.save(cliente);
    }

}
