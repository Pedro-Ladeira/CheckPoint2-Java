# Sistema de Cadastro de Brinquedos 🎲

## 🧠 Objetivo do Projeto

Este projeto é uma API REST desenvolvida com Spring Boot que permite cadastrar e listar brinquedos em um banco de dados Oracle. Ele simula o backend de um sistema de gerenciamento de brinquedos para uma empresa.

---

## 🏗️ Estrutura do Projeto

A aplicação segue o padrão de camadas:

### 📦 `model/Brinquedo.java`
Classe que representa o brinquedo (a entidade). Contém os atributos:

```java 
private Long id;
private String nome;
private Double preco;
private String fabricante;
```

> Esta classe é anotada com `@Entity` para o JPA mapear a tabela no banco.

---

### 💾 `repository/BrinquedoRepository.java`
Interface que estende `JpaRepository`. Ela fornece os métodos prontos para acessar o banco de dados (findAll, save, etc).

---

### 🌐 `controller/BrinquedoController.java`
Classe que expõe os endpoints REST:

- `@GetMapping("/brinquedos")`: retorna todos os brinquedos cadastrados.
- `@PostMapping("/brinquedos")`: cadastra um novo brinquedo.

---

### 🚀 `BrinquedosApplication.java`
Classe principal com `@SpringBootApplication` que inicia a aplicação.

---

## ⚙️ Configurações do Banco de Dados

No arquivo `application.properties`, configuramos a conexão com Oracle:

```
spring.datasource.url=jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL
spring.datasource.username=rm558514
spring.datasource.password=030904
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
```

> Certifique-se de que o banco está acessível e o usuário possui permissão.

---

## 📮 Testando a API com Postman

### 1. **GET** - Listar brinquedos
- Método: `GET`
- URL: `http://localhost:8080/brinquedos`

### 2. **POST** - Cadastrar brinquedo
- Método: `POST`
- URL: `http://localhost:8080/brinquedos`
- Body: (raw, JSON)
```json
{
  "nome": "Lego Star Wars",
  "preco": 149.99,
  "fabricante": "LEGO"
}
```

---

## 🧪 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.1.5
- Maven
- Oracle SQL Developer
- Postman
- IntelliJ IDEA

---

## 📂 Organização para Entrega

- `README.md` → você está lendo ele agora ✅
- `brinquedos.txt` → com nome e RM de todos os integrantes ✅
- `print_configuracao_spring_initializr.jpg` → print da tela do site ✅
- Pasta completa do projeto (src, pom.xml, etc) ✅

---

Desenvolvido para fins acadêmicos na FIAP 📘