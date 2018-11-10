package com.michel.atividade1.classes;

import java.util.Arrays;

public class Funcionarios {
	
	private String nrCpf;
	private String nomeFuncionario;
	private double salario;
	private int tamanhoAtual = 0;
	private Funcionarios[] arrayFuncionarios;
	
	
	public Funcionarios(int elementos) {
		
		this.arrayFuncionarios = new Funcionarios[elementos];
		
	}
	
	public Funcionarios(String nrCpf, String nomeFuncionario, double salario) {
		
		this.nrCpf = nrCpf;
		this.nomeFuncionario = nomeFuncionario;
		this.salario = salario;
		
	}
	
	public void adicionaFuncionarios(String nrCpf, String nomeFuncionario, double salario) {
		
		this.arrayFuncionarios[this.tamanhoAtual] = new Funcionarios(nrCpf, nomeFuncionario, salario);
		this.tamanhoAtual++;
		
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public double retornaMediaSalarial() {
		
	    double valorMediaSalarial = 0;
		double somaSalario = 0;
		
		for (int i = 0; i < this.tamanhoAtual; i++) {
			somaSalario = somaSalario + this.arrayFuncionarios[i].getSalario();
		}
		
		valorMediaSalarial = somaSalario/this.tamanhoAtual;
		
		return valorMediaSalarial;
	}

	@Override
	public String toString() {
		return "Funcionarios [nrCpf=" + nrCpf + ", nomeFuncionario=" + nomeFuncionario + ", salario=" + salario
				+ ", tamanhoAtual=" + tamanhoAtual + ", arrayFuncionarios=" + Arrays.toString(arrayFuncionarios) + "]";
	}
	
	public int getTamanhoAtual() {
		
		return this.tamanhoAtual;
		
	}
	
	public int getElementosArray() {
		
		return this.arrayFuncionarios.length;
		
	}
	
	

}
