package com.example.dto_revisao.service;

import com.example.dto_revisao.dto.AdmRequestDTO;
import com.example.dto_revisao.dto.AdmResponseDTO;
import com.example.dto_revisao.entity.AdmEntity;
import com.example.dto_revisao.repository.AdmRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Service
public class AdmService {
    private final AdmRepository admRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public AdmService(AdmRepository admRepository, BCryptPasswordEncoder passwordEncoder) {
        this.admRepository = admRepository;
        this.passwordEncoder = passwordEncoder;
    }
    // ADICIONAR - CREATE - ADICIONAR

    public AdmEntity criarAdm (AdmRequestDTO dto) {
        if (admRepository.findByEmail(dto.getEmail()).isPresent()) {
            throw new RuntimeException("Usuário já cadastrado");
        }
        AdmEntity novoAdm = new AdmEntity();
        novoAdm.setNome(dto.getNome());
        novoAdm.setSexo(dto.getSexo());
        novoAdm.setEmail(dto.getEmail());
        novoAdm.setTelefone(dto.getTelefone());
        novoAdm.setCodigoAcesso(dto.getCodigoAcesso());
        novoAdm.setSenha(passwordEncoder.encode(dto.getSenha()));

        return admRepository.save(novoAdm);
    }

    // READ - LISTAR

    public List<AdmResponseDTO> listarAdm () {
        return admRepository
                .findAll()
                .stream()
                .map(a -> new AdmResponseDTO(

                ))
                .toList();
    }

    // UPDATE - EDITAR

    public AdmEntity editarAdm (Long id, AdmEntity adm) {
        if (!admRepository.existsById(id)) {
            throw new IllegalArgumentException("Administrador não encontrado");
        }

        adm.setId(id);
        return admRepository.save(adm);
    }

    public void deletar (Long id) {
        if (!admRepository.existsById(id)) {
            throw new IllegalArgumentException("Administrador não encontrado");
        }
        admRepository.deleteById(id);
    }

}
