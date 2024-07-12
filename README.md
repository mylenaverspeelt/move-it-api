# Move-it API

Move-it API é uma aplicação back-end desenvolvida com Spring Boot que fornece funcionalidades básicas de autenticação e autorização para login de usuários. A aplicação usa o banco de dados H2 para armazenamento e gerenciamento de dados. 

O front-end desse projeto se encontra nesse reporitorio: https://github.com/mylenaverspeelt/move-it

### Funcionalidades

- Autenticação de Login: Permite que usuários façam login usando email e senha.
- Registro de Novos Usuários: Permite cadastrar novos pacientes garantindo unicidade pelo email.
- Geração de Tokens JWT: Emite tokens JWT (JSON Web Tokens) para autenticação de usuários.
- Armazenamento de Dados: Utiliza um banco de dados H2 para armazenar informações de usuários e autenticação.
- A estrutura de pastas foi pensada para facilitar a organização e manutenção do código, seguindo boas práticas de arquitetura e design de software.

### Tecnologias Utilizadas

- Spring Boot: Framework principal para o desenvolvimento da aplicação.
- Spring Data JPA: Para o gerenciamento de persistência de dados.
- Spring Security: Para gerenciar autenticação e autorização.
- H2 Database: Banco de dados em memória usado para armazenamento de dados.
- JWT (JSON Web Token): Para gerenciamento de autenticação de sessão.

### Endpoints
* POST /login
- Autentica um usuário e retorna um token JWT.

![image](https://github.com/user-attachments/assets/3e7798ac-b25d-45be-ac83-716fef9fba71)

* POST /register
- Cadastro de novos usuários

![image](https://github.com/user-attachments/assets/518c22f4-47ec-4872-8665-bac4691d5740)


### Estrutura do Projeto

```

```

### Hospedagem na AWS

O projeto está hospedado no DNS: 

- Criei uma Instância EC2 do tipo t2.micro
- Configurei o Security Groups para permitir tráfego HTTP/HTTPS e SSH
- Gerei o par de chaves SSH e me conectei à instância da EC2
- Instalei o JDK 17 e Maven na EC2
- Fiz o upload do arquivo JAR da aplicação para a instância EC2 usando SCP (secure copy protocol)
- Executei o arquivo JAR que foi enviado
- A configuração de CORS foi realizada para permitir que a API aceite requisições de origens específicas, garantindo a comunicação entre o front-end e o back-end
- Testei os endpoints realizando requisições no Thunder Client, na porta 8080 

### Download do Projeto

Pré-requisitos:

- JDK 17
- Maven

1. Abra o terminal, clone o repositório e navegue até a raiz do projeto:

```
git clone [https://github.com/seu-usuario/login-auth-api.git](https://github.com/mylenaverspeelt/move-it-api.git)
cd move-it-api
```

2. Compilar e Executar o Projeto:
- Para compilar e executar o projeto usando Maven, utilize os comandos:

```
mvn clean install
mvn spring-boot:run
```
- A aplicação será iniciada na porta 8080 por padrão.
