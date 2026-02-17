📌 Code Challenge - Uber (Backend Java + Spring Boot + Clean Architecture)

Este projeto foi desenvolvido como parte de um desafio técnico inspirado em uma vaga Backend, utilizando Java + Spring Boot e aplicando conceitos de Arquitetura Limpa (Clean Architecture).

O objetivo principal do projeto é criar uma aplicação bem estruturada, seguindo boas práticas de organização de código, separação de responsabilidades e escalabilidade.

🚀 Tecnologias Utilizadas

Java 17+

Spring Boot

Maven

Clean Architecture

AWS SES (planejado)

DTO Pattern

Exceptions Handler

🏗️ Arquitetura do Projeto

O projeto foi estruturado seguindo os princípios da Arquitetura Limpa, separando as responsabilidades em camadas bem definidas.

📌 Camadas

✅ Core (Domain Layer)
Contém as regras de negócio puras, entidades e contratos que não dependem de frameworks.

✅ Application Layer (Use Cases)
Contém os casos de uso da aplicação e regras de aplicação.

✅ Adapters Layer
Responsável por adaptar entradas e saídas do sistema (ex: requests, responses, conversões).

✅ Infrastructure Layer
Responsável por integrações externas como banco de dados, serviços externos e implementações concretas.
