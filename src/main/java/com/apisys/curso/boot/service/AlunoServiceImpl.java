package com.apisys.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apisys.curso.boot.dao.AlunoDao;
import com.apisys.curso.boot.domain.Aluno;

@Service
@Transactional(readOnly = false)
public class AlunoServiceImpl implements AlunoService {
	
	@Autowired
	private AlunoDao dao;

	@Override
	public void salvar(Aluno aluno) {
		dao.save(aluno);
		
	}

	@Override
	public void editar(Aluno aluno) {
		dao.update(aluno);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Aluno buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Aluno> buscarTodos() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
