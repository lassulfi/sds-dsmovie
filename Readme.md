# Semana Spring React - SDS 6.0

Projeto do evento Semana Spring React da [DevSuperior](https://devsuperior.com.br/).

O projeto consiste em um sistema de avaliação de filmes e séries, onde o usuário pode escolher um filme de uma lista e fazer uma avaliação de 1 a 5. Para fazer a avaliação o usuário informa o seu email e escolhe a nota. Caso o usuário já tenha avaliado um filme, ao fazer uma nova avaliação a sua nota é atualizada.

O projeto utiliza as seguintes stacks: o React no Frontend, Java e SpringBoot no backend e deploy em nuvem, através das plataformas [Netlify](https://www.netlify.com/) e [Heroku](https://id.heroku.com/login).

O projeto do backend utiliza a arquitetura em camadas.

# Stacks utilizadas na semana
- [React](https://pt-br.reactjs.org/)
- [NodeJS](https://nodejs.org/en/) (versão 16.13.1)
- [yarn](https://yarnpkg.com/) (versão 1.22.5)
- [Java](https://www.java.com/pt-BR/) (versão 11 ou versão 17)
- [Maven](https://maven.apache.org/) (versão 3.6.3)
- [SpringBoot](https://spring.io/projects/spring-boot) 2.6.2
- [H2 Database](https://www.h2database.com/html/main.html)
- [Postgres](https://www.postgresql.org/) (versão 12)

# Rodando o projeto

## Iniciando o banco de dados Postgres

O Banco de dados postgres é utilizado no ambiente de homologação. Esse projeto utiliza o banco com o docker. Para iniciar o banco, digite o seguinte comando na raiz do projeto:

```shell
docker-compose up
```

Com a instância do banco inicializada, acesse o PgAdmin em http://localhost:9000 com o username admin@user.com e com a senha admin e crie um servidor com as seguintes configurações:

- name: dsmovie
- host: db
- username: postgres
- password: 1234567
- maintenance database: dsmovie (opcional)

Caso o banco de dados **dsmovie** não tenha sido adicionado como *maintenance database*, crie o banco de dados. Em seguida, acesse o query tools do banco de dados, copie o conteudo do create.sql no diretório backend e execute a query para criar as tabelas.

## Sem containers

Para executar o projeto sem containers é necessário ter instalado localmente as stacks utilizadas na semana. Também é necessário que o banco de dados esteja criado, juntamente com a as tabelas e o seed.

### Iniciando o backend:

Na pasta do projeto do backend execute o seguinte comando:

```shell
mvn spring-boot:run 
```

### Iniciando o frontend:

Na pasta do projeto do frontend execute o seguinte comando:

```shell
yarn start
```

## TODOS

- Containers
    - [X] Criar container para o ambiente de desenvolvimento da aplicação backend
    - [] Criar container para o ambiente de produção da aplicação backend
    - [X] Criar container para o ambiente de desenvolvimento da aplicação frontend
    - [] Criar container para o ambiente de produção da aplicação frontend

- Backend
    - [] Implementar testes no backend para a arquitetura em camadas
    - [X] Implementar Swagger2 (atualizar conforme a evolução do projeto)
    - [] Alterar a arquitetura do backend para arquitetura Ports & Adapters (hexagonal)
    - [] Implementar os testes para o novo padrão arquitetural
    - [] Implementar segurança
    - [] Implementar o cadastro de filmes

- Frontend:
    - [] Incluir o arquivo .env para armazenar as variáveis de ambiente
    - [] Implementar a abstração para a biblioteca do Axios
    - [] Implementar formulario de cadastro de filmes

- CI/CD
  - [] Implementar o processo de CI/CD com o github actions