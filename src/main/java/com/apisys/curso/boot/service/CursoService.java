package com.apisys.curso.boot.service;

import java.util.List;

import com.apisys.curso.boot.domain.Curso;

public interface CursoService {
	
    public void salvar(Curso curso);

	public void editar(Curso curso);
	
	public void excluir(Long id);	
	
	public Curso buscarPorId(Long id);
		
	public List<Curso> buscarTodos(); 

}
