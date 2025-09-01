# Lista de Tarefas (CRUD)

Este é um projeto de uma aplicação de lista de tarefas completa, desenvolvida para demonstrar um **CRUD (Create, Read, Update, Delete)** full-stack. O front-end é construído com **Angular**, e o back-end é uma API RESTful em **Java com Spring Boot**, que interage com um banco de dados para gerenciar as tarefas.

## Funcionalidades

-   **Adicionar Tarefa**: Insira um item na lista.
-   **Visualizar Tarefas**: Veja todas as tarefas salvas.
-   **Editar Tarefa**: Modifique a descrição de uma tarefa. A edição é feita "inline" ao clicar no texto da tarefa.
-   **Concluir Tarefa**: Marque uma tarefa como concluída (o texto muda e fica riscado).
-   **Excluir Tarefa**: Remova uma tarefa da lista.
-   **Modo Escuro**: Alterne entre os temas claro e escuro para uma melhor experiência visual.

## Tecnologias Utilizadas

### Front-end
-   **Angular**: Framework JavaScript para a interface do usuário.
-   **TypeScript**: Linguagem base do Angular.
-   **HTML/CSS**: Para a estrutura e estilização da página.

### Back-end
-   **Java 21**: Linguagem de programação principal.
-   **Spring Boot**: Framework para o desenvolvimento da API REST.
-   **Spring Data JPA**: Facilita a interação com o banco de dados.
-   **Maven**: Gerenciador de dependências do projeto.

### Banco de Dados
-   **H2**:  Banco de dados em memória, ideal para ambientes de desenvolvimento e teste.

## Como Executar o Projeto

Siga os passos abaixo para rodar o projeto em sua máquina local.

### Pré-requisitos
-   **JDK 21** ou superior.
-   **Node.js e npm** (versão LTS recomendada).
-   **Angular CLI**: Instale-o com `npm install -g @angular/cli`.

### 1. Configurar o Back-end (Spring Boot)

1.  Clone este repositório:
    `git clone <URL_DO_SEU_REPOSITORIO>`
2.  Navegue até a pasta do back-end (`lista-tarefas-api`).
3.  Abra o projeto em sua IDE (como VS Code ou IntelliJ).
4.  Como o H2 é um banco de dados em memória, nenhuma configuração adicional é necessária. O Spring Boot se encarregará de tudo automaticamente.
5.  Execute a aplicação Spring Boot. Isso pode ser feito através da sua IDE ou pelo terminal com o comando Maven:
    `./mvnw spring-boot:run`
    A API estará disponível em `http://localhost:8080`.

### 2. Rodar o Front-end (Angular)

1.  Abra um novo terminal e navegue até a pasta do front-end (`lista-tarefas-web`).
2.  Instale as dependências:
    `npm install`
3.  Inicie o servidor de desenvolvimento do Angular:
    `ng serve`
4.  Abra seu navegador e acesse `http://localhost:4200` para ver a aplicação em funcionamento.

## Autor

-   **Leonardo Henrique Pereira Tubero** - [GitHub](https://github.com/LeonardoHenriqueTubero)
