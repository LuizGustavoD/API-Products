# API de Produtos
Uma API RESTful para gerenciamento de produtos, desenvolvida em Spring Boot como projeto de demonstração.
## 📋 Funcionalidades
- **CRUD Completo de Produtos**
  - Criar novos produtos
  - Listar todos os produtos
  - Buscar produto por ID
  - Atualizar produtos existentes
  - Excluir produtos
- **Validação de Dados** com Bean Validation
- **Tratamento de Erros** padronizado
- **Arquitetura em Camadas** (controller, service, repository, model)
- **Frontend em React** (a ser implementado) com Tailwind CSS para estilização
## 🛠️ Tecnologias Utilizadas
### Backend
- **Spring Boot** - Framework para criação de aplicações Java
- **Spring Data JPA** - Persistência de dados
- **Banco de Dados SQL** (MySQL/PostgreSQL/SQL Server/etc.) - Banco de dados relacional
- **Maven** ou **Gradle** - Gerenciamento de dependências
### Frontend (a ser implementado)
- **React** - Biblioteca JavaScript para interface de usuário
- **Tailwind CSS** - Framework CSS para estilização
## 📦 Instalação e Execução
### Pré-requisitos
- Java 11 ou superior
- Maven ou Gradle
- Node.js e npm (para o frontend, quando for implementado)
- Banco de dados SQL de sua preferência (MySQL, PostgreSQL, etc.)
### Backend
1. Clone o repositório:
```bash
git clone https://github.com/LuizGustavoD/API-Products.git
cd API-Products
```
2. Configure o banco de dados:
   - Crie um banco de dados no seu SGBD
   - Altere as configurações de conexão no arquivo `application.properties` (ou `application.yml`) conforme necessário
3. Execute a aplicação:
```bash
# Se using Maven
mvn spring-boot:run
# Ou se using Gradle
gradle bootRun
```
### Frontend (quando disponível)
1. Navegue para o diretório do frontend:
```bash
cd frontend
```
2. Instale as dependências:
```bash
npm install
```
3. Execute a aplicação:
```bash
npm start
```
## 🚀 Como Usar
### Endpoints da API
A API estará disponível em `http://localhost:8080` (ou outra porta configurada).
#### Listar todos os produtos
```http
GET /api/products
```
#### Buscar produto por ID
```http
GET /api/products/{id}
```
#### Criar um novo produto
```http
POST /api/products
Content-Type: application/json
{
  "name": "Nome do Produto",
  "description": "Descrição do produto",
  "price": 99.99,
  "quantity": 10
}
```
#### Atualizar um produto
```http
PUT /api/products/{id}
Content-Type: application/json
{
  "name": "Nome Atualizado",
  "description": "Descrição atualizada",
  "price": 89.99,
  "quantity": 5
}
```
#### Excluir um produto
```http
DELETE /api/products/{id}
```
## 📝 Estrutura do Projeto
```
API-Products/
│
├── src/main/java/
│   └── com/apiproducts/
│       ├── controller/       # Controladores REST
│       ├── service/          # Lógica de negócio
│       ├── repository/       # Camada de persistência
│       ├── model/            # Entidades JPA
│       └── configuration/    # Configurações
│
├── src/main/resources/
│   └── application.properties # Configurações da aplicação
│
├── frontend/                 # Diretório do React (a ser implementado)
│   ├── public/
│   ├── src/
│   │   ├── components/
│   │   ├── services/
│   │   └── ...
│   └── package.json
│
└── README.md
```
## 🤝 Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.
## 📄 Licença
Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
---
Desenvolvido por [LuizGustavoD](https://github.com/LuizGustavoD)
