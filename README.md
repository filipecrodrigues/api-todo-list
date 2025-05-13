# API de Tarefas (Todo API)

Uma API RESTful leve construída com Spring Boot para gerenciar tarefas a fazer. Esta API simples permite listar, criar e excluir tarefas através de endpoints HTTP.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Web

## Estrutura do Projeto

O projeto possui uma estrutura simples:
- `TodoApiApplication.java` - A classe principal da aplicação com configuração do Spring Boot
- `ApiController.java` - Controlador REST que gerencia as requisições HTTP

## Endpoints da API

| Método | Endpoint | Descrição |
|--------|----------|-------------|
| GET    | /tasks   | Listar todas as tarefas |
| POST   | /tasks   | Criar uma nova tarefa |
| DELETE | /tasks   | Limpar todas as tarefas |

O servidor iniciará na porta 8080 por padrão.

## Exemplos de Uso

### Listar todas as tarefas
```
GET http://localhost:8080/tasks
```
Resposta:
```json
["Comprar mantimentos", "Finalizar projeto", "Ir à academia"]
```

### Criar uma nova tarefa
```
POST http://localhost:8080/tasks
Content-Type: application/json

"Aprender Spring Boot"
```

### Limpar todas as tarefas
```
DELETE http://localhost:8080/tasks
```
