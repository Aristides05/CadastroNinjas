# 🥷 Projeto API Ninja | Missions - Spring Boot

Este projeto foi desenvolvido durante os primeiros estudos com Spring Boot, inspirado por uma videoaula do canal **Fiasco**, e expandido com novas funcionalidades, especialmente no módulo de **Missões**. O objetivo principal foi aprender a construir uma API REST com Java e Spring Boot, utilizando o Spring Data JPA para persistência de dados.

## 🚀 Tecnologias utilizadas

- ![Java](https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg) [Java](https://www.oracle.com/java/)
- ![Spring Boot](https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg) [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Web](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#web)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Banco de dados H2](https://www.h2database.com/)

## ℹ️ Sobre o projeto

A aplicação é uma API RESTful que permite o **cadastro, listagem, atualização e exclusão** de:

- **Ninjas**, contendo informações como nome, vila e rank.
- **Missões**, com nome, descrição, rank de dificuldade e status.

As operações são feitas por meio de endpoints separados (`/ninjas` e `/missao`) que se comunicam com os serviços e repositórios via Spring Data JPA.

### 🔹 NinjaController
- Cadastrar ninja (via JSON ou parâmetros URL)
- Listar todos os ninjas ou buscar por ID
- Deletar um ninja ou todos os registros

### 🔹 MissaoController
- Cadastrar missão (via JSON ou parâmetros URL)
- Listar todas as missões ou buscar por ID
- Deletar missão (individual ou em massa)
- Atualizar o status da missão por ID

Atualmente, todos os métodos de persistência usam apenas os **recursos nativos do JPA**, sem queries customizadas.

## 🛠️ Melhorias planejadas

Alguns recursos que pretendo implementar nas próximas versões:

- Implementar lógica para **atribuir uma missão a um ninja**
- Desenvolver um **frontend** para gerenciar ninjas e missões de forma visual

## ⚠️ Observações

- Projeto desenvolvido com fins educacionais.
- Algumas boas práticas já foram aplicadas (como separação em camadas: controller, service, repository, model).
- O módulo de **Missões** foi significativamente expandido em relação ao conteúdo original do vídeo.