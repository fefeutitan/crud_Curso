package com.apisys.curso.boot.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="curso")
public class Curso extends AbstractEntity<Long>{
		
	@OneToMany(mappedBy = "curso")
	private List<Aluno> alunos;	

	@Column
	private String cd_curso;	
	
	@Column
	private String nm_curso;	
	
	@Column
	private String nm_instituicao;
		
	public String getCd_curso() {
		return cd_curso;
	}
	public void setCd_curso(String cd_curso) {
		this.cd_curso = cd_curso;
	}
	public String getNm_curso() {
		return nm_curso;
	}
	public void setNm_curso(String nm_curso) {
		this.nm_curso = nm_curso;
	}
	public String getNm_instituicao() {
		return nm_instituicao;
	}
	public void setNm_instituicao(String nm_instituicao) {
		this.nm_instituicao = nm_instituicao;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	
}
