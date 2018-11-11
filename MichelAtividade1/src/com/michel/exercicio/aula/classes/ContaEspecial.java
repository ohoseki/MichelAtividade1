package com.michel.exercicio.aula.classes;

public class ContaEspecial extends ContaBancaria {
	
	public ContaEspecial() {
		
		super();
		System.out.println("Exercicio de ContaEspecial, Exercicio 3 da aula do Michel, onde e desconmtado 10 por cento do valor a ser sacado ou depositado");
		
	}
	
	public void saque(double valor) {
		
		super.saldo -=valor+=valor*0.10;
		
	}
	
	public void deposita(double valor) {
		
		super.saldo+=valor-=valor*0.10;
		
	}
	
	

}
