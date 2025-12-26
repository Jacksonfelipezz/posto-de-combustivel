# ⛽ Sistema de Gestão de Abastecimentos - Posto de Combustível

Este projeto foi desenvolvido para atender ao **Desafio Técnico Júnior #1**. A aplicação gerencia o fluxo de um posto de combustível, desde o cadastro de produtos até o registro de abastecimentos.

## 🎯 Objetivo do Projeto
Desenvolver uma solução robusta para o cadastro e consulta de operações de um posto, garantindo a organização do código em camadas e a persistência dos dados em arquivo.

## 🖼️ Demonstração do Sistema
Abaixo, a interface do Swagger UI gerada automaticamente, onde é possível testar todos os endpoints da aplicação:

![Interface do Swagger](screenshots/swagger-ui.png)

## 🚀 Tecnologias Utilizadas
* **Java 21 (LTS)**: Utilizando as últimas funcionalidades da linguagem.
* **Spring Boot 3**: Framework base para a construção da API RESTful.
* **Spring Data JPA**: Para abstração da camada de dados.
* **H2 Database**: Banco de dados configurado com persistência em arquivo local (`./data`).
* **Lombok**: Para redução de código repetitivo.
* **SpringDoc OpenAPI (Swagger)**: Documentação automática e interativa.

## ✅ Requisitos do Desafio Atendidos
- [x] **Tipos de Combustível**: CRUD completo (Nome e Preço por litro).
- [x] **Bombas de Combustível**: Operações relacionadas a um tipo de combustível.
- [x] **Abastecimentos**: Registro com data, litragem e vínculo com a bomba.
- [x] **Persistência**: Dados mantidos em arquivo local após o restart da aplicação.
- [x] **Organização**: Código estruturado em camadas (Controller, Service, Repository).

## ⚙️ Configuração e Execução
1. Certifique-se de ter o **JDK 21** instalado.
2. Clone o repositório e execute via IDE ou terminal:
   ```bash
   ./mvnw spring-boot:run
🔗 Links Úteis:
Swagger UI: http://localhost:8080/swagger-ui.html

H2 Console: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:file:./data/posto_de_combustivel_db

## 🎓 Aprendizado e Créditos
Este projeto foi desenvolvido como parte de um desafio técnico, com o apoio educacional dos conteúdos da **Javanauta**, aplicando conceitos de arquitetura de camadas e padrões RESTful.

