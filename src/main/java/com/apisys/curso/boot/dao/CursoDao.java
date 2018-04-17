package com.apisys.curso.boot.dao;

import java.util.List;

import com.apisys.curso.boot.domain.Curso;

public interface CursoDao {

	void save(Curso curso);
	void update(Curso curso);
	void delete(Long id);
	Curso findById(Long id);
	List<Curso> findAll();
	
}
