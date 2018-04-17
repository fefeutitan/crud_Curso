package com.apisys.curso.boot.service;

import java.util.List;

import com.apisys.curso.boot.domain.Aluno;

public interface AlunoService {
	
	void salvar(Aluno aluno);
	
	void editar(Aluno aluno);
	
	void excluir(Long id);
	
	Aluno buscarPorId(Long id);
	
	List<Aluno> buscarTodos();

}
