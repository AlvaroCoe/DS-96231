package com.example.exercicioDTO.service;

import com.example.exercicioDTO.dto.CursoRequestDTO;
import com.example.exercicioDTO.dto.CursoResponseDTO;
import com.example.exercicioDTO.entity.CursoEntity;
import com.example.exercicioDTO.repository.CursoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository repository;

    @Autowired
    private ModelMapper mapper;

    // LISTAR
    public List<CursoResponseDTO> ListarCurso() {
        return repository.findAll()
                .stream()
                .map(curso -> mapper.map(curso, CursoResponseDTO.class))
                .toList();
    }

    // ADICIONAR
    public CursoEntity SalvarCurso(CursoRequestDTO dto) {
        if (repository.findBySigla(dto.getSigla()).isPresent()) {
            throw new RuntimeException("Curso com a sigla " + dto.getSigla() + " já cadastrado!");
        }

        // Converte DTO para Entidade automaticamente
        CursoEntity novoCurso = mapper.map(dto, CursoEntity.class);
        
        return repository.save(novoCurso);
    }

    // ATUALIZAR
    public CursoEntity AtualizarCurso(String sigla, CursoEntity novosDados) {
        CursoEntity cursoExistente = repository.findBySigla(sigla)
                .orElseThrow(() -> new IllegalArgumentException("Curso " + sigla + " não encontrado"));

        // Mantém o ID original para garantir que o JPA faça o UPDATE e não um novo INSERT
        novosDados.setId(cursoExistente.getId()); 
        
        return repository.save(novosDados);
    }

    // DELETAR (Ajustado para o nome que você usou no Controller)
    public void excluir(String sigla) {
        if (repository.findBySigla(sigla).isEmpty()) {
            throw new IllegalArgumentException("Não é possível excluir: Curso " + sigla + " não encontrado!");
        }
        repository.deleteBySigla(sigla);
    }
}