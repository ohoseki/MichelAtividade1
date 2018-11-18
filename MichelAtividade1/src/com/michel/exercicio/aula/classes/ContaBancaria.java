package com.michel.exercicio.aula.classes;

public class ContaBancaria {
	
	protected double saldo;
	protected String nomeCliente; 
	protected String endCliente; 
	protected String cpfCliente;	
	protected String classificacao;
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(String nomeCliente, String endCliente, String cpfCliente) {
		super();
		this.nomeCliente = nomeCliente; this.endCliente = endCliente; this.cpfCliente = cpfCliente;
		}	
	
	public void saque(double valor) {
		
		saldo -=valor;
		this.getClassificacao();
		
	}
	
	public void deposita(double valor) {
		
		saldo+=valor;
		this.getClassificacao();
		
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getTaxaBancaria() {
		
		return 1.00;
		
	}
	
	public double getTaxaBancaria(int dias) {
		
		return this.getTaxaBancaria()*dias;
		
	}
	
	public double getTaxaBancaria(int dias, int meses) {
		
		return this.getTaxaBancaria(dias)+this.getTaxaBancaria(meses*30);
		
	}
	
	public String getClassificacao() {
		
		if (ClassificacaoCliente.Potencial.isCompatible(this.getSaldo()) == true ) {
			this.classificacao = "Cliente Potencial";
			return this.classificacao;
		}if (ClassificacaoCliente.Medio.isCompatible(this.getSaldo()) == true ) {
			this.classificacao = "Cliente Medio";
			return this.classificacao;
		}if (ClassificacaoCliente.Baixo.isCompatible(this.getSaldo()) == true ) {
			this.classificacao = "Cliente Baixo";
			return this.classificacao;
		}else return "Nenhuma" +this.getSaldo();
		
	}
	

}
