package com.example.dto_revisao.service;

import com.example.dto_revisao.dto.AdmResponseDTO;
import com.example.dto_revisao.repository.AdmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdmService {

    private final AdmRepository repository;
    private final BCryptPasswordEncoder passwordEncoder;

    public AdmService(AdmRepository repository, BCryptPasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    //LISTAR
    public List<AdmResponseDTO> listaAdm(){
        return repository
                .findAll()
                .stream()
                .map (a -> new AdmResponseDTO(
                        a.getNome(),
                        a.getCodigoAcesso(),
                        a.getTelefone()
                ))
                .toList();
    }
}
