# API de Gestão de Clientes (v2)

Esta API foi desenvolvida para consolidar conceitos avançados de Spring Boot, focando em organização de código e tratamento de dados.

# Evolução gradativa

Diferente das versões iniciais, este projeto implementa camadas bem definidas para garantir escalabilidade:

* **Service Layer:** Toda a regra de negócio foi movida para classes `@Service` (O que foi implementado), deixando os Controllers responsáveis apenas pelas requisições.
* **Exception Handling:** Implementação de tratamento de erros customizado para retornos HTTP mais claros ao usuário.
* **CRUD Completo:** Endpoints para Criar, Ler, Atualizar e Deletar Clientes e Funcionários.

# Tecnologias

* Java 21/25
* Spring Boot
* Spring Data JPA
* Maven

# Como testar

1.  Certifique-se de ter o Maven instalado.
2.  Rode a aplicação e aponte para `localhost:8080/clientes`.
3.  Utilize o **Insomnia** ou **Postman** para testar os endpoints.
