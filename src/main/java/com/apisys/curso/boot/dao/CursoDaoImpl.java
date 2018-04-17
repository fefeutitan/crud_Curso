package com.apisys.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.apisys.curso.boot.domain.Curso;

@Repository
public class CursoDaoImpl extends AbstractDao<Curso, Long> implements CursoDao{

}
