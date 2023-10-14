# Todo List
<p align="center">
 <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
 <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" />
 </p>
 <p align="center">

 <img src="https://img.shields.io/github/languages/top/Todoist/Spacetime-web">
 <img src="https://img.shields.io/github/languages/count/lcspaiva87/todolist">
 <img src="https://img.shields.io/github/repo-size/lcspaiva87/todolist">
 <img src="https://img.shields.io/github/forks/lcspaiva87/todolist?style=social">
<img src="https://img.shields.io/github/contributors/lcspaiva87/todolist">
<img src = "https://img.shields.io/github/last-commit/lcspaiva87/todolist">
</p>
> **🚀** Um gerenciador de tarefas desenvolvido em Java 17 com Spring Boot 3.

## O que é?

> Este projeto é um gerenciador de tarefas desenvolvido em Java 17 com Spring Boot 3. Foi desenvolvido como parte do evento gratuito "Semana JAVA" fornecido pela Rocketseat.

## Tecnologias utilizadas

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.11/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.11/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.11/reference/htmlsingle/index.html#web)
* [H2 Database](https://www.h2database.com/html/main.html)
* [BCrypt](https://docs.spring.io/spring-security/site/docs/4.2.20.RELEASE/apidocs/org/springframework/security/crypto/bcrypt/BCryptPasswordEncoder.html)

## Como executar
> 1. Clone o repositório do projeto:
git clone https://github.com/lcspaiva87/todolist
> 2. Nessa documentação você terá o passo a passo para instalar o maven:
link https://www.notion.so/Maven-8667c3fcb8a24fe6a50772660942c254
> 3. Nessa documentação você terá o passo a passo para instalar o Java 17:
link https://www.notion.so/ea9820a3ec9044f1bce6750d671d2211
> 4. Execute o comando para iniciar a aplicação:
mvn spring-boot:run
> Acesse a aplicação no navegador em http://localhost:8080/
# Estrutura de Pastas do Projeto
```markdown
my-react-app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   ├── resources/
│   ├── test/
├── target/
├── Dockerfile
├── pom
├── README.md
└── ...
```
## Endpoints da API
A seguir, são listados os endpoints da API para executar as operações CRUD em produtos:

### 1. **Criar Usuário**

- **Método**: POST
- **Endpoint**: `/users/`
- **Descrição**: Retorna `idUser`, `username`, `name`, `password`, e `createdAt`

### 2. **Listar Tasks**

- **Método**: GET
- **Endpoint**: `/tasks/`
- **Descrição**:Retorna uma lista de todas as tarefas do usuário autenticado.

### 3. **Criar Produto**
- **Método**: POST
- **Endpoint**: `/tasks/`
- **Descrição**: Cria uma nova tarefa com base nos dados fornecidos no corpo da solicitação. Os campos obrigatórios são `description`, `title`, `priority`, `startDate`,`idUser`,  e `endDate`.

### 4. **Atualizar Produto**

- **Método**: PUT
- **Endpoint**: `/tasks/:id`
- **Descrição**: Atualiza os dados de um task existente com base no ID fornecido. Os campos que podem ser atualizados são `description`, `title`, `priority`,
## Funcionalidades
A aplicação permite que você cadastre, edite e exclua tarefas. Você também pode marcar tarefas como concluídas.

## Contribuições
São bem-vindas contribuições para este projeto. Para contribuir, basta criar um fork do repositório e enviar um pull request com suas alterações.

## Licença
Este projeto está licenciado sob a licença MIT.

## Agradecimentos
Agradeço à Rocketseat pelo evento gratuito, que me motivou a desenvolver este projeto.
### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

