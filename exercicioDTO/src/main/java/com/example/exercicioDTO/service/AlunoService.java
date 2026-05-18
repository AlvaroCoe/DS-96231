package com.example.exercicioDTO.service;

import com.example.exercicioDTO.dto.AlunoRequestDTO;
import com.example.exercicioDTO.dto.AlunoResponseDTO;
import com.example.exercicioDTO.dto.AlunoUpdateDTO;
import com.example.exercicioDTO.entity.AlunoEntity;
import com.example.exercicioDTO.repository.AlunorRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunorRepository repository;
    private final BCryptPasswordEncoder passwordEncoder;

    public AlunoService(AlunorRepository repository, BCryptPasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    public List<AlunoResponseDTO> ListarAluno() {
        return repository.findAll().stream()
                .map(a -> new AlunoResponseDTO(a.getNome(), a.getCurso(), a.getTurno(), a.getCodigoAcesso()))
                .toList();
    }

    public AlunoEntity SalvarAluno(AlunoRequestDTO dto) {
        if (repository.findByCodigoAcesso(dto.getCodigoAcesso()).isPresent()) {
            throw new RuntimeException("Código de acesso único! Já em uso!");
        }
        AlunoEntity novoAluno = new AlunoEntity();
        novoAluno.setNome(dto.getNome());
        novoAluno.setEmail(dto.getEmail());
        novoAluno.setCurso(dto.getCurso());
        novoAluno.setTurno(dto.getTurno());
        novoAluno.setCodigoAcesso(dto.getCodigoAcesso());
        novoAluno.setSenha(passwordEncoder.encode(dto.getSenha()));
        return repository.save(novoAluno);
    }

    public AlunoEntity AtualizarAlunoCA(String codigoAcesso, AlunoUpdateDTO novosDados) {
        AlunoEntity alunoExistente = repository.findByCodigoAcesso(codigoAcesso)
                .orElseThrow(() -> new IllegalArgumentException("Aluno não encontrado"));
        alunoExistente.setNome(novosDados.getNome());
        alunoExistente.setCurso(novosDados.getCurso());
        alunoExistente.setTurno(novosDados.getTurno());
        return repository.save(alunoExistente);
    }

    public void excluirPorCA(String codigoAcesso) {
        if (repository.findByCodigoAcesso(codigoAcesso).isEmpty()) {
            throw new IllegalArgumentException("Aluno não encontrado com o CA: " + codigoAcesso);
        }
        repository.deleteByCodigoAcesso(codigoAcesso);
    }
}