package com.apisys.curso.boot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apisys.curso.boot.domain.Curso;
import com.apisys.curso.boot.service.CursoService;

@Controller
@RequestMapping("/cursos")
public class CursoController {
	
	@Autowired
	private CursoService service;

	@GetMapping("/cadastrar")
	public String cadastrar(Curso curso) {
		return "/curso/cadastro";
	}
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("cursos", service.buscarTodos());
		return "/curso/lista";
	}
	@PostMapping("/salvar")
	public String salvar(Curso curso) {
		service.salvar(curso);
		return "redirect:/cursos/cadastrar";
	}
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("curso", service.buscarPorId(id));
		return "/curso/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(Curso curso) {
		service.editar(curso);
		return "redirect:/cursos/cadastrar";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		if (!service.cursoTemAlunos(id)) {
			service.excluir(id);
		}
		return listar(model);
	}

}
