package com.apisys.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apisys.curso.boot.dao.CursoDao;
import com.apisys.curso.boot.domain.Curso;

@Service
public class CursoServiceImpl implements CursoService {
	
	@Autowired
	private CursoDao dao;

	@Override
	@Transactional(readOnly = false)
	public void salvar(Curso curso) {
		dao.save(curso);
		
	}

	@Override
	@Transactional(readOnly = false)
	public void editar(Curso curso) {
		dao.update(curso);
		
	}

	@Override
	@Transactional(readOnly = false)
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Curso buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Curso> buscarTodos() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public boolean cursoTemAlunos(Long id) {
		if(buscarPorId(id).getAlunos().isEmpty()) {
			return false;
		}
		return true;
	}


}
