package com.apisys.curso.boot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
@Table(name="aluno")
public class Aluno extends AbstractEntity<Long>{
	
	@Column
	@NotBlank(message = "Digite o nome do aluno.")
	@Size(min = 3, max = 255, message = "O nome do aluno deve ter entre {min} e {max} caracteres")
	private String nm_aluno;	
	
	@NotNull(message = "Selecione o curso relativo ao aluno")
	@ManyToOne
	@JoinColumn(name = "cd_curso")
	private Curso curso;		
	
	@Column
	private int nu_matricula;	
	
	@Column	
	private int nu_semestre;	

	@NotNull(message = "Selecione o status relativo ao aluno")
	@Column(name="ds_status") 
	@Enumerated(EnumType.ORDINAL)
	private Status status;

	public String getNm_aluno() {
		return nm_aluno;
	}


	public void setNm_aluno(String nm_aluno) {
		this.nm_aluno = nm_aluno;
	}


	public Curso getCd_curso() {
		return curso;
	}
	
	public void setCd_curso(Curso cd_curso) {
		this.curso = cd_curso;
	}

	public int getNu_matricula() {
		return nu_matricula;
	}


	public void setNu_matricula(int nu_matricula) {
		this.nu_matricula = nu_matricula;
	}


	public int getNu_semestre() {
		return nu_semestre;
	}


	public void setNu_semestre(int nu_semestre) {
		this.nu_semestre = nu_semestre;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}
	
	/*
	public enum MyEnum{ matriculado , trancado , jubilado }; 
	private MyEnum ds_status;	
	@Column(name="ds_status") 
	@Enumerated(EnumType.ORDINAL) 
	public MyEnum getMyEnum() { 
	    return ds_status;
	}
	*/
	
	
	
		
}
