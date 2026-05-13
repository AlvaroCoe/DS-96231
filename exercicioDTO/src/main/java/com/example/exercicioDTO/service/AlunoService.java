package com.example.exercicioDTO.service;

import com.example.exercicioDTO.dto.AlunoRequestDTO;
import com.example.exercicioDTO.dto.AlunoResponseDTO;
import com.example.exercicioDTO.entity.AlunosEntity;
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
                        a.getTurno()
                ))
                .toList();
    }

    //ADICIONAR

    public AlunosEntity SalvarAluno(AlunoRequestDTO dto) {
        if (repository.findByNome(dto.getNome()).isPresent()) {
            throw new RuntimeException("Nome já em uso!");

        }

        AlunosEntity novoAluno = new AlunosEntity();
        novoAluno.setNome(dto.getNome());
        novoAluno.setEmail(dto.getEmail());
        novoAluno.setCurso(dto.getCurso());
        novoAluno.setTurno(dto.getTurno());
        novoAluno.setCodigoAcesso(dto.getCodigoAcesso());
        novoAluno.setSenha(dto.getSenha());

        return repository.save(novoAluno);

    }

    //ATUALIZAR

    public AlunosEntity AtualizarAlunoCA(String nome, AlunosEntity novosDados) {
        AlunosEntity AlunoExistente = repository.findByNome(nome)
                .orElseThrow(() -> new IllegalArgumentException("Aluno com nome "
                        + nome + " não encontrado"));

    novosDados.setId(AlunoExistente.getId()); // Mantém o ID original para atualizar o mesmo registro
    return repository.save(novosDados);
}

   //DELETAR
    
    public void excluirPorCA(String nome) {

        if (repository.findByNome(nome).isEmpty()) {
            throw new IllegalArgumentException("Aluno não encontrado com o nome: " + nome);
        }
        repository.deleteByNome(nome);
    }

}

//ESTUDAR MAIS O ATUALIZAR E O DELETAR, IMPLEMENTANDO AS ATUALIZAÇÕES E DELETES POR NOME/LOGIN....