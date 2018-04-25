package com.apisys.curso.boot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.apisys.curso.boot.domain.Aluno;
import com.apisys.curso.boot.domain.Curso;
import com.apisys.curso.boot.domain.Status;
import com.apisys.curso.boot.service.AlunoService;
import com.apisys.curso.boot.service.CursoService;

@Controller
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	@Autowired
	private CursoService cursoService;

	@GetMapping("/cadastrar")
	public String cadastrar(Aluno aluno) {
		return "/aluno/cadastro";
	}
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("alunos", alunoService.buscarTodos());
		return "/aluno/lista";
	}
	@PostMapping("/salvar")
	public String salvar(Aluno aluno, RedirectAttributes attr) {
		alunoService.salvar(aluno);
		attr.addFlashAttribute("success", "Aluno INSERIDO com sucesso.");
		return "redirect:/alunos/cadastrar";
	}
	
	@ModelAttribute("cursos")
	public List<Curso> listaDeCursos(){
		return cursoService.buscarTodos();
	}
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("aluno", alunoService.buscarPorId(id));
		return "/aluno/cadastro";		
	}
	
	@PostMapping("/editar")
	public String editar(Aluno aluno, RedirectAttributes attr) {
		alunoService.editar(aluno);
		attr.addFlashAttribute("success", "Aluno EDITADO com sucesso.");
		return "redirect:/alunos/cadastrar";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {		
			alunoService.excluir(id);
			model.addAttribute("success", "Curso REMOVIDO com sucesso.");
		return listar(model);
	}
		
	@ModelAttribute("status0")
	public Status[] getStatus() {
		return Status.values();
	}

}
