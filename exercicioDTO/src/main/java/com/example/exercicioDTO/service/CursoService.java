package com.example.exercicioDTO.service;

import com.example.exercicioDTO.dto.AlunoRequestDTO;
import com.example.exercicioDTO.dto.CursoRequestDTO;
import com.example.exercicioDTO.dto.CursoResponseDTO;
import com.example.exercicioDTO.dto.ProfessorResponseDTO;
import com.example.exercicioDTO.entity.AlunoEntity;
import com.example.exercicioDTO.entity.CursoEntity;
import com.example.exercicioDTO.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    public CursoRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public List<CursoResponseDTO> ListarCurso () {
        return repository
                .findAll()
                .stream()
                .map(c -> new CursoResponseDTO(
                        c.getNome(),
                        c.getSigla(),
                        c.getTurno(),
                        c.getValor()
                ))
                .toList();
    }
    //ADICIONAR

    public CursoEntity AddCurso (CursoRequestDTO dto) {
        if (repository.findBySigla(dto.getSigla()).isPresent()) {
            throw new RuntimeException("Curso já cadastrado!");

        }

        CursoEntity novoCurso = new CursoEntity();
        novoCurso.setNome(dto.getNome());
        novoCurso.setSigla(dto.getSigla());
        novoCurso.setSetor(dto.getSetor());
        novoCurso.setTurno(dto.getTurno());
        novoCurso.setValor(dto.getValor());

        return repository.save(novoCurso);

    }

    //ATUALIZAR

    public CursoEntity AtualizarCurso (String sigla, CursoEntity novosDados) {
        CursoEntity CursoExistente = repository.findBySigla(sigla)
                .orElseThrow(() -> new IllegalArgumentException("Curso "
                        + sigla + " não encontrado"));

        novosDados.setId(CursoExistente.getId()); // Mantém o ID original para atualizar o mesmo registro
        return repository.save(novosDados);
    }

    //DELETAR

    public void excluirPorSigla(String sigla) {

        if (repository.findBySigla(sigla).isEmpty()) {
            throw new IllegalArgumentException("Curso " + sigla + "não encontrado!");
        }
        repository.deleteBySigla(sigla);
    }

}


