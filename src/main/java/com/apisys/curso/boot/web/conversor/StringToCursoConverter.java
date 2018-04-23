package com.apisys.curso.boot.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.apisys.curso.boot.domain.Curso;
import com.apisys.curso.boot.service.CursoService;

@Component
public class StringToCursoConverter implements Converter<String, Curso>{

	@Autowired
	private CursoService service;
	
	@Override
	public Curso convert(String text) {
		if(text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}

}
