package com.michel.exercicio.aula.classes;

public class ContaBancaria {
	
	protected double saldo;
	
	public void saque(double valor) {
		
		saldo -=valor;
		
	}
	
	public void deposita(double valor) {
		
		saldo+=valor;
		
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

}
