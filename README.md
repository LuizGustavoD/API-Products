# API-Products

**Treino para utilização do Spring Boot para desenvolvimento de APIs e funcionalidades**

---

## 📌 Sumário

- [Visão Geral](#visão-geral)  
- [Funcionalidades](#funcionalidades)  
- [Pré-requisitos](#pré-requisitos)  
- [Instalação](#instalação)  
- [Uso](#uso)  
- [Estrutura do Projeto](#estrutura-do-projeto)  
- [Testes](#testes)  
- [API Endpoints](#api-endpoints)  
- [Tecnologias Utilizadas](#tecnologias-utilizadas)  
- [Contribuição](#contribuição)  
- [Licença](#licença)

---

## 📖 Visão Geral

Este projeto é um estudo direcionado à criação de APIs RESTful com **Spring Boot**, visando aprimorar habilidades no desenvolvimento de backends em Java.  
O foco está na implementação de funcionalidades típicas de APIs, como gerenciamento de produtos, operações CRUD e uso de boas práticas.

---

## ⚙️ Funcionalidades

- Criação, leitura, atualização e deleção de produtos (`CRUD`)
- Validação de dados com Bean Validation (`@Valid`)
- Tratamento de exceções com respostas padronizadas
- Uso de DTOs para separar modelo interno e dados expostos
- Busca de produtos por ID

---

## 🛠 Pré-requisitos

Certifique-se de ter instalado:

- Java JDK 17+  
- Maven  
- IDE como IntelliJ IDEA ou Eclipse  
- (Opcional) Docker e Docker Compose, caso utilize banco em contêiner  

---

## 🚀 Instalação

1. Clone o repositório:

   ```bash
   git clone https://github.com/LuizGustavoD/API-Products.git
Acesse o diretório:

bash
Copiar
Editar
cd API-Products
Execute a API:

bash
Copiar
Editar
mvn spring-boot:run
A API estará disponível em http://localhost:8080.

▶️ Uso
Utilize Postman, Insomnia ou cURL para testar os endpoints.

Exemplo de requisição POST para criar um produto:

http
Copiar
Editar
POST /api/products
Content-Type: application/json

{
  "name": "Produto A",
  "price": 19.90,
  "description": "Descrição do produto A"
}
📂 Estrutura do Projeto
bash
Copiar
Editar
src/
├── main/
│   ├── java/com/seuusuario/apiproducts/
│   │   ├── controller/       # Endpoints REST
│   │   ├── service/          # Regras de negócio
│   │   ├── repository/       # Persistência (Spring Data JPA)
│   │   ├── model/            # Entidades
│   │   ├── dto/              # Objetos de transferência de dados
│   │   └── exception/        # Tratamento de erros
│   └── resources/
│       ├── application.properties
│       └── data.sql          # (Opcional) dados iniciais
└── test/                     # Testes automatizados
🧪 Testes
Para executar os testes automatizados:

bash
Copiar
Editar
mvn test
📡 API Endpoints
Método	Rota	Descrição
GET	/api/products	Listar todos os produtos
GET	/api/products/{id}	Consultar produto por ID
POST	/api/products	Criar novo produto
PUT	/api/products/{id}	Atualizar produto existente
DELETE	/api/products/{id}	Remover produto existente

💻 Tecnologias Utilizadas
Spring Boot – framework principal

Spring MVC – estrutura para API REST

Spring Data JPA – persistência de dados

Bean Validation – validação de dados

Banco H2 / MySQL / PostgreSQL – (dependendo da configuração)

Maven – gerenciamento de dependências

🤝 Contribuição
Contribuições são bem-vindas!

Faça um fork do projeto

Crie uma branch (feature/minha-feature)

Commit suas alterações (git commit -m "feat: nova feature")

Envie um Pull Request

📜 Licença
Este projeto está sob a licença MIT.
Veja o arquivo LICENSE para mais detalhes.

lua
Copiar
Editar

Quer que eu adicione também um **badge bonito** (por exemplo: build status, linguagem usada, versão do Java) no topo do README para deixar mais profissional?






Você disse:
Faça em um bloco só para eu copiar e ficar bom no .md


O ChatGPT disse:
Perfeito! Aqui está o README completo em um único bloco, pronto para colar direto no seu README.md:

markdown
Copiar
Editar
# API-Products

**Treino para utilização do Spring Boot para desenvolvimento de APIs e funcionalidades**

---

## 📌 Sumário

- [Visão Geral](#visão-geral)  
- [Funcionalidades](#funcionalidades)  
- [Pré-requisitos](#pré-requisitos)  
- [Instalação](#instalação)  
- [Uso](#uso)  
- [Estrutura do Projeto](#estrutura-do-projeto)  
- [Testes](#testes)  
- [API Endpoints](#api-endpoints)  
- [Tecnologias Utilizadas](#tecnologias-utilizadas)  
- [Contribuição](#contribuição)  
- [Licença](#licença)

---

## 📖 Visão Geral

Este projeto é um estudo direcionado à criação de APIs RESTful com **Spring Boot**, visando aprimorar habilidades no desenvolvimento de backends em Java.  
O foco está na implementação de funcionalidades típicas de APIs, como gerenciamento de produtos, operações CRUD e uso de boas práticas.

---

## ⚙️ Funcionalidades

- Criação, leitura, atualização e deleção de produtos (`CRUD`)
- Validação de dados com Bean Validation (`@Valid`)
- Tratamento de exceções com respostas padronizadas
- Uso de DTOs para separar modelo interno e dados expostos
- Busca de produtos por ID

---

## 🛠 Pré-requisitos

Certifique-se de ter instalado:

- Java JDK 17+  
- Maven  
- IDE como IntelliJ IDEA ou Eclipse  
- (Opcional) Docker e Docker Compose, caso utilize banco em contêiner  

---

## 🚀 Instalação

1. Clone o repositório:

   ```bash
   git clone https://github.com/LuizGustavoD/API-Products.git
Acesse o diretório:

bash
Copiar
Editar
cd API-Products
Execute a API:

bash
Copiar
Editar
mvn spring-boot:run
A API estará disponível em http://localhost:8080.

▶️ Uso
Utilize Postman, Insomnia ou cURL para testar os endpoints.

Exemplo de requisição POST para criar um produto:

http
Copiar
Editar
POST /api/products
Content-Type: application/json

{
  "name": "Produto A",
  "price": 19.90,
  "description": "Descrição do produto A"
}
📂 Estrutura do Projeto
bash
Copiar
Editar
src/
├── main/
│   ├── java/com/seuusuario/apiproducts/
│   │   ├── controller/       # Endpoints REST
│   │   ├── service/          # Regras de negócio
│   │   ├── repository/       # Persistência (Spring Data JPA)
│   │   ├── model/            # Entidades
│   │   ├── dto/              # Objetos de transferência de dados
│   │   └── exception/        # Tratamento de erros
│   └── resources/
│       ├── application.properties
│       └── data.sql          # (Opcional) dados iniciais
└── test/                     # Testes automatizados
🧪 Testes
Para executar os testes automatizados:

bash
Copiar
Editar
mvn test
📡 API Endpoints
Método	Rota	Descrição
GET	/api/products	Listar todos os produtos
GET	/api/products/{id}	Consultar produto por ID
POST	/api/products	Criar novo produto
PUT	/api/products/{id}	Atualizar produto existente
DELETE	/api/products/{id}	Remover produto existente

💻 Tecnologias Utilizadas
Spring Boot – framework principal

Spring MVC – estrutura para API REST

Spring Data JPA – persistência de dados

Bean Validation – validação de dados

Banco H2 / MySQL / PostgreSQL – (dependendo da configuração)

Maven – gerenciamento de dependências

🤝 Contribuição
Contribuições são bem-vindas!

Faça um fork do projeto

Crie uma branch (feature/minha-feature)

Commit suas alterações (git commit -m "feat: nova feature")

Envie um Pull Request

📜 Licença
Este projeto está sob a licença MIT.
Veja o arquivo LICENSE para mais detalhes.

nginx
Copiar
Editar

Quer que eu adicione **badges de status** (Java version, Maven, Spring Boot) no topo para deixar mais bonito e profissional?
