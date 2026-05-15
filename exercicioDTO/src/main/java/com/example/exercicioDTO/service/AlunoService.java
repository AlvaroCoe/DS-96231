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

    //@Autowired
    //public AlunorRepository repository;

    //@Autowired
    //private BCryptPasswordEncoder passwordEncoder;

    //A recomendação atual da equipe do Spring é utilizar injeção via construtor.
    //...Isso facilita testes unitários e garante que a classe não seja instanciada
    //...sem suas dependências obrigatórias.Abaixo Atualizado.

    private final AlunorRepository repository;
    private final BCryptPasswordEncoder passwordEncoder;

    public AlunoService(AlunorRepository repository, BCryptPasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
}




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
        novoAluno.setSenha(passwordEncoder.encode(dto.getSenha()));

        return repository.save(novoAluno);

    }

    //ATUALIZAR ATUALIZADO

    //public AlunoEntity AtualizarAlunoCA(String codigoAcesso, AlunoEntity novosDados) {
        //AlunoEntity AlunoExistente = repository.findByCodigoAcesso(codigoAcesso)
                //.orElseThrow(() -> new IllegalArgumentException("Aluno com CA "
                        //+ codigoAcesso + " não encontrado"));

    //novosDados.setId(AlunoExistente.getId()); // Mantém o ID original para atualizar o mesmo registro
    //return repository.save(novosDados);
}

// No AlunoService
public AlunoEntity AtualizarAlunoCA(String codigoAcesso, AlunoUpdateDTO novosDados) {
    // 1. Busca o aluno atual no banco
    AlunoEntity alunoExistente = repository.findByCodigoAcesso(codigoAcesso)
            .orElseThrow(() -> new IllegalArgumentException("Aluno não encontrado"));

    // 2. Atualiza apenas os campos permitidos vindos do DTO
    alunoExistente.setNome(novosDados.getNome());
    alunoExistente.setCurso(novosDados.getCurso());
    alunoExistente.setTurno(novosDados.getTurno());
    // Note que não atualizamos o ID nem o Código de Acesso aqui

    // 3. Salva a entidade atualizada
    return repository.save(alunoExistente);
}

   //DELETAR
    
    public void excluirPorCA(String codigoAcesso) {

        if (repository.findByCodigoAcesso(codigoAcesso).isEmpty()) {
            throw new IllegalArgumentException("Aluno não encontrado com o CA: " + codigoAcesso);
        }
        repository.deleteByCodigoAcesso(codigoAcesso);
    }

}
