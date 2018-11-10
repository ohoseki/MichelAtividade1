package com.michel.atividade1.classes;

public class Calculadora {

	
	public int calculaValor(String operador, int valor1, int valor2) {
		
		if (operador == "+") {
		
			return valor1 + valor2;
			
		} else if( operador == "*") {
			
			return valor1 * valor2;
			
		} else if (operador == "-") {
			
			return valor1 - valor2;
			
		} else if (operador == "/") {
			
			return valor1 / valor2;
			
		} else
			
		return 0;
		
	}
	
	public double calculaValor(String operador, double valor1, double valor2) {
		
		if (operador == "+") {
		
			return valor1 + valor2;
			
		} else if( operador == "*") {
			
			return valor1 * valor2;
			
		} else if (operador == "-") {
			
			return valor1 - valor2;
			
		} else if (operador == "/") {
			
			return valor1 / valor2;
			
		} else
			
		return 0;
		
	}
		

}
