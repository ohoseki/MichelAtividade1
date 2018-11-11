package com.michel.exercicio.aula.classes;

public class Cliente {
	
	private String numeroRg;
	private String numeroCPF;
	private String endereco;
	private String nome;
	
	public Cliente() {
		
		System.out.println("Inicio do Exercicio 1 Cliente, metodo contrutor");
		
	}
	
	public Cliente(String numeroRg) {
		
		this();
		this.numeroRg = numeroRg;
		
	}
	
	public Cliente(String numeroRG, String numeroCPF, String endereco, String nome) {
		
		this(numeroRG);
		this.numeroCPF = numeroCPF;
		this.endereco = endereco;
		this.nome = nome;
		
	}

	public String getNumeroRg() {
		return numeroRg;
	}

	public void setNumeroRg(String numeroRg) {
		this.numeroRg = numeroRg;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [numeroRg=" + numeroRg + ", numeroCPF=" + numeroCPF + ", endereco=" + endereco + ", nome="
				+ nome + "]";
	}
	
	
	

}
