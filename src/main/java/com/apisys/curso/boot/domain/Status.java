package com.apisys.curso.boot.domain;

public enum Status {
	
    MATRICULADO(1, "Matriculado"), 
    TRANCADO(2, "Trancado"), 
    JUBILADO(3, "Jubilado");
	
	private int valor;
	private String descricao="";
	
	private Status(int valor, String descricao) {
		this.valor=valor;
		this.descricao=descricao;
	}
	
	private Status() {		
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	
}
