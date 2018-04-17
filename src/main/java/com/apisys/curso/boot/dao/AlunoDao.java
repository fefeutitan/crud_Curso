package com.apisys.curso.boot.dao;

import java.util.List;

import com.apisys.curso.boot.domain.Aluno;

public interface AlunoDao {

	void save(Aluno aluno);
	void update(Aluno aluno);
	void delete(Long id);
	Aluno findById(Long id);
	List<Aluno> findAll();

}
