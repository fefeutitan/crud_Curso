# crud_Curso

Criar uma aplicação Java Web com os requisitos abaixo.

Requisitos funcionais:

*CRUD de curso (create, read, update e delete)

-Tela para listagem de cursos
-Tela para criar novo curso
-Tela para edição de um curso
-Botão para criar, editar e excluir


*CRUD de aluno (create, read, update e delete)

-Tela para listagem de alunos
-Tela para criar novo aluno
-Tela para edição de um aluno
-Botão para criar, editar e excluir


*Campos da entidade / tabela de curso:

-id (Long)
-código do curso (string)
-nome do curso (string)
-instituição de ensino (string)


*Campos da entidade / tabela de aluno:

-id (Long)
-nome do aluno (string)
-curso (associação 1:1 com a entidade de curso)
-número de matrícula (inteiro)
-semestre (inteiro)
-status (enum -> matriculado / trancado / jubilado)


Requisitos técnicos:

*Front-end: Thymeleaf
*Backend: 
-Maven
-Spring Boot + Spring MVC
-JPA / hibernate 
*Banco de dados: MySQL 
*Publicar o projeto no GitHub
