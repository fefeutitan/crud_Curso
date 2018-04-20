package com.apisys.curso.boot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apisys.curso.boot.domain.Aluno;
import com.apisys.curso.boot.service.AlunoService;

@Controller
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoService service;

	@GetMapping("/cadastrar")
	public String cadastrar(Aluno aluno) {
		return "/aluno/cadastro";
	}
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("alunos", service.buscarTodos());
		return "/aluno/lista";
	}
	@PostMapping("/salvar")
	public String salvar(Aluno aluno) {
		service.salvar(aluno);
		return "redirect:/cursos/cadastrar";
	}
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("aluno", service.buscarPorId(id));
		return "/aluno/cadastro";		
	}
	
	@PostMapping("/editar")
	public String editar(Aluno aluno) {
		service.editar(aluno);
		return "redirect:/alunos/cadastrar";
	}

}
