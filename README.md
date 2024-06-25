# LoanAPI

## Descrição

Este projeto é um microsserviço de gerenciamento de empréstimos, desenvolvido utilizando Spring Web, Validation, Actuator e Lombok. A API RESTful permite realizar uma requisição de empréstimo de acordo com as informações pessoais do objeto `Customer`. 

## Tecnologias Utilizadas

- **Java**
- **Spring Framework**
- **Postman**: Utilizado para testar a API.
- **Conceitos**: Clean Code, Clean Architecture, REST.

## Funcionalidades

A API permite a seguinte operação:

### Loan Service

- **RequestLoan**: Solicitar um novo empréstimo.

## Estrutura do Projeto

A estrutura do projeto segue os princípios de Clean Architecture, garantindo que o código seja modular, fácil de manter e escalável.

## Testando a API
Utilize o Postman para testar o endpoint da API.

### Endpoints:

### LoanController:
- **POST** /api/customer-loans: Solicita um empréstimo passando um `Customer` como parâmetro, tendo em retorno um DTO com os empréstimos disponíveis.

