<h1> DSCatalog </h1>

Instrutor: Prof. Dr. Nélio Alves  
Escola: DevSuperior  

Sumário:
- [Sobre](#sobre)
- [Objetivo](#objetivo)
- [Recursos](#recursos)
- [Grade Curricular](#grade-curricular)
- [Padrões adotados](#padrões-adotados)
- [Modelo de domínio](#modelo-de-domínio)
  - [Endpoints principais](#endpoints-principais)
    - [Produtos](#produtos)
    - [Categorias](#categorias)
  - [Paginação e ordenação](#paginação-e-ordenação)
- [Exemplos de requisições](#exemplos-de-requisições)
  - [Inserir nova categoria](#inserir-nova-categoria)
  - [Inserir novo produto](#inserir-novo-produto)
  - [Atualizar categoria](#atualizar-categoria)
  - [Atualizar produto](#atualizar-produto)
- [Licença](#licença)



# Sobre
DSCatalog é um projeto guiado desenvolvido durante o primeiro módulo do curso Java Spring Expert da escola DevSuperior.

# Objetivo
O projeto tem como objetivo consolidar os fundamentos do desenvolvimento backend com **Spring Boot**, **JPA/Hibernate** e **boas práticas de API REST**, incluindo paginação, tratamento de exceções e modelagem relacional.

# Recursos

* Java 25
* Spring Boot 4.0.1
* Maven 4.0.0
* Banco de dados H2
* STS 4 (IDE)

# Grade Curricular

[✔] Setup do projeto DSCatalog  
[✔] Banco de dados H2  
[✔] Criação de entidades  
[✔] Transações e sessão JPA  
[✔] Seeding da base de dados  
[✔] Criação de ambiente no Postman  
[✔] Tratamento de exceções  
[✔] CRUD  
[✔] Dados de auditoria  
[✔] Relacionamento N-N (revisão)  
[✔] Mapeamento JPA N-N 

# Padrões adotados
- Arquitetura em camadas (Controller, Service, Repository)
- DTOs para comunicação externa
- Paginação com Spring Data Pageable

# Modelo de domínio
- **Product**
- **Category**
- Relacionamento **N–N**
- Campos de auditoria (`createdAt`, `updatedAt`)

## Endpoints principais

### Produtos
- `GET /products`
- `GET /products/{id}`
- `POST /products`
- `PUT /products/{id}`
- `DELETE /products/{id}`

### Categorias
- `GET /categories`
- `GET /categories/{id}`
- `POST /categories`
- `PUT /categories/{id}`
- `DELETE /categories/{id}`

## Paginação e ordenação

A API utiliza paginação baseada em `Pageable` do Spring Data.

Parâmetros suportados:
- `page`
- `size`
- `sort`

Exemplo:
```http
GET /products?page=0&size=12&sort=name,asc
```

# Exemplos de requisições

## Inserir nova categoria

```json
{
    "name" : "Garden"
}
```

## Inserir novo produto

```json
{
    "name": "PS5",
    "description": "The new generation PS5 video game",
    "price": 600.0,
    "imgUrl": "",
    "date": "2020-07-20T10:00:00Z",
    "categories": [
        {
            "id": 1
        },
        {
            "id": 3
        }
    ]
}
```

## Atualizar categoria

```json
{
    "name" : "Fiction"
}
```

## Atualizar produto

```json
{
    "name": "Updated product name",
    "description": "Updated product description",
    "price": 600.0,
    "imgUrl": "",
    "date": "2020-07-20T10:00:00Z",
    "categories": [
        {
            "id": 1
        },
        {
            "id": 3
        }
    ]
}
```


# Licença

[MIT License](backend/LICENSE)