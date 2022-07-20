# 👨🏼‍💻 Backend Movieflix Catálogo de Filmes
## 📚 Bootcamp Desenvolvedor Fullstack Spring React DevSuperior 3.0

## 🔷 Tecnologias<br>
1. Spring Boot<br>
2. Spring Data JPA<br>
3. ORM<br>
4. H2 Database <br>

## 🔷 Competences<br>
### Domínio e ORM<br>
1. Implementação de um modelo de domínio complexo (projeto DSLearn)<br>
2. Instanciação (seed) de um modelo de domínio com SQL<br>
### Autorizações<br>
1. Autorização customizada em nível de serviço<br>
2. Conteúdo customizado para o usuário logado<br>
3. Refresh token<br>
4. Pré-autorização de métodos<br>


## 🔷 Features
1. DTO (Data Transfer Object) principles<br>
2. Automaticaly converter DTO to Entity<br>
3. Custom Exception Handler messages<br>
4. Resources (REST Controller)<br>
5. DTO<br>
6. Services<br>
7. Entities<br>
8. Respositories<br>
9. Exceptions<br>

## 🔷 Built With<br>
Spring Initializr<br>
Maven<br>

How can I test my endpoints?<br>

For tests cases, you can check the API endpoints with Postman.<br>

[Postman Collection](https://www.postman.com/)<br>

## 🔷 Endpoint que deverá ser feito:
Obter o perfil do usuário logado

### GET /users/profile

## Casos de uso<br>
Efetuar login<br>
[IN] O usuário anônimo informa seu email e senha<br>
[OUT] O sistema informa um token válido<br>
## Listar filmes<br>
[OUT] O sistema apresenta uma listagem dos nomes de todos gêneros, bem como uma listagem paginada com título, subtítulo, ano e imagem dos filmes, ordenada alfabeticamente por título.
[IN] O usuário visitante ou membro seleciona, opcionalmente, um gênero.<br>
[OUT] O sistema apresenta a listagem atualizada, restringindo somente ao gênero selecionado.<br>
## Visualizar detalhes do filme<br>
[IN] O usuário visitante ou membro seleciona um filme<br>
[OUT] O sistema informa título, subtítulo, ano, imagem e sinopse do filme, e também uma listagem dos textos das avaliações daquele filme juntamente com nome do usuário que fez cada avaliação.<br>
[IN] O usuário membro informa, opcionalmente, um texto para avaliação do filme.<br>
[OUT] O sistema apresenta os dados atualizados, já aparecendo também a avaliação feita pelo usuário.<br>
<br>
## Exceção 3.1 - Texto vazio<br>
3.1.1. O sistema apresenta uma mensagem de que não é permitido texto vazio na avaliação <br>

