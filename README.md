# crud_Curso

Criar uma aplicação Java Web com os requisitos abaixo.

Requisitos funcionais:
•	CRUD de curso (create, read, update e delete)
o	Tela para listagem de cursos
o	Tela para criar novo curso
o	Tela para edição de um curso
o	Botão para criar, editar e excluir

•	CRUD de aluno (create, read, update e delete)
o	Tela para listagem de alunos
o	Tela para criar novo aluno
o	Tela para edição de um aluno
o	Botão para criar, editar e excluir

•	Campos da entidade / tabela de curso:
o	id (Long)
o	código do curso (string)
o	nome do curso (string)
o	instituição de ensino (string)

•	Campos da entidade / tabela de aluno:
o	id (Long)
o	nome do aluno (string)
o	curso (associação 1:1 com a entidade de curso)
o	número de matrícula (inteiro)
o	semestre (inteiro)
o	status (enum -> matriculado / trancado / jubilado)

Requisitos técnicos:
•	Front-end: Thymeleaf
•	Backend: 
o	Maven
o	Spring Boot + Spring MVC
o	JPA / hibernate 
•	Banco de dados: MySQL 
•	Publicar o projeto no GitHub
