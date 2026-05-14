package com.example.exercicioDTO.service;

import com.example.exercicioDTO.dto.ProfessorRequestDTO;
import com.example.exercicioDTO.dto.ProfessorResponseDTO;
import com.example.exercicioDTO.entity.ProfessorEntity;
import com.example.exercicioDTO.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    public ProfessorRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public List<ProfessorResponseDTO> ListarProfessores() {
        return repository
                .findAll()
                .stream()
                .map(p -> new ProfessorResponseDTO(
                        p.getNome(),
                        p.getEmail(),
                        p.getTurno(),
                        p.getCodigoAcesso()
                ))
                .toList();
    }

    public ProfessorEntity AdicionarProfessor(ProfessorRequestDTO dto) {
        if (repository.findByCodigoAcesso(dto.getCodigoAcesso()).isPresent()) {
            throw new RuntimeException("Código de acesso único! Já em uso!");
        }

        ProfessorEntity novoProfessor = new ProfessorEntity();
        novoProfessor.setNome(dto.getNome());
        novoProfessor.setEmail(dto.getEmail());
        novoProfessor.setDisciplina(dto.getDisciplina());
        novoProfessor.setTurno(dto.getTurno());
        novoProfessor.setCodigoAcesso(dto.getCodigoAcesso());
        novoProfessor.setSenha(dto.getSenha());

        return repository.save(novoProfessor);
    }

    //ATUALIZAR

    public ProfessorEntity AtualizarProfessor (String codigoAcesso, ProfessorEntity novosDados) {
        ProfessorEntity ProfessorExistente = repository.findByCodigoAcesso(codigoAcesso)
                .orElseThrow(() -> new IllegalArgumentException("Professor com CA "
                        + codigoAcesso + " não encontrado"));

        novosDados.setId(ProfessorExistente.getId()); // Mantém o ID original para atualizar o mesmo registro
        return repository.save(novosDados);
    }

    //DELETAR

    public void excluirPorCA(String codigoAcesso) {

        if (repository.findByCodigoAcesso(codigoAcesso).isEmpty()) {
            throw new IllegalArgumentException("Professor não encontrado com o CA: " + codigoAcesso);
        }
        repository.deleteByCodigoAcesso(codigoAcesso);
    }

}
