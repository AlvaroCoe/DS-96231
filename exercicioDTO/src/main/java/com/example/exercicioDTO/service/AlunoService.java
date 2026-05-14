package com.example.exercicioDTO.service;

import com.example.exercicioDTO.dto.AlunoRequestDTO;
import com.example.exercicioDTO.dto.AlunoResponseDTO;
import com.example.exercicioDTO.entity.AlunoEntity;
import com.example.exercicioDTO.repository.AlunorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    public AlunorRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    //LISTAR

    public List<AlunoResponseDTO> ListarAluno() {
        return repository
                .findAll()
                .stream()
                .map(a -> new AlunoResponseDTO(
                        a.getNome(),
                        a.getCurso(),
                        a.getTurno(),
                        a.getCodigoAcesso()
                ))
                .toList();
    }

    //ADICIONAR

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
        novoAluno.setSenha(dto.getSenha());

        return repository.save(novoAluno);

    }

    //ATUALIZAR

    public AlunoEntity AtualizarAlunoCA(String codigoAcesso, AlunoEntity novosDados) {
        AlunoEntity AlunoExistente = repository.findByCodigoAcesso(codigoAcesso)
                .orElseThrow(() -> new IllegalArgumentException("Aluno com CA "
                        + codigoAcesso + " não encontrado"));

    novosDados.setId(AlunoExistente.getId()); // Mantém o ID original para atualizar o mesmo registro
    return repository.save(novosDados);
}

   //DELETAR
    
    public void excluirPorCA(String codigoAcesso) {

        if (repository.findByCodigoAcesso(codigoAcesso).isEmpty()) {
            throw new IllegalArgumentException("Aluno não encontrado com o CA: " + codigoAcesso);
        }
        repository.deleteByCodigoAcesso(codigoAcesso);
    }

}

//ESTUDAR MAIS O ATUALIZAR E O DELETAR, IMPLEMENTANDO AS ATUALIZAÇÕES E DELETES POR NOME/LOGIN....