package com.apisys.curso.boot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="aluno")
public class Aluno extends AbstractEntity<Long>{
	
	@Column
	private String nm_aluno;	
	
	@ManyToOne
	@JoinColumn(name = "cd_curso")
	private Curso curso;		
	
	@Column
	private int nu_matricula;	
	
	@Column	
	private int nu_semestre;
	
	public enum MyEnum{ matriculado , trancado , jubilado }; 
	private MyEnum ds_status;
	@Column(name="ds_status") 
	@Enumerated(EnumType.ORDINAL) 
	public MyEnum getMyEnum() { 
	    return ds_status;
	}
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
	public MyEnum getDs_status() {
		return ds_status;
	}
	public void setDs_status(MyEnum ds_status) {
		this.ds_status = ds_status;
	}
	
		
}
