package com.michel.exercicio.aula.classes;

public class ContaPoupanca extends ContaBancaria{
	
	private int diaAniversario;
	
	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(String nomeCliente, String endCliente, String cpfCliente) {
		
		super();
		super.nomeCliente = nomeCliente;
		super.endCliente = endCliente;
		super.cpfCliente = cpfCliente;
		
	}
	
	public void saque(double valor) {
		
		saldo-=valor-0.10;
		
	}

}
