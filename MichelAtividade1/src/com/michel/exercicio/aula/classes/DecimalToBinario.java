package com.michel.exercicio.aula.classes;

public class DecimalToBinario {
	
	private int nDecimal;
	private int nResto = 0;
	private String nResult = "";
	
	public DecimalToBinario (int nDecimal) {
		
		System.out.println("Exercicio 2 - Convertendo de Decimal para Binario");
		this.nDecimal = nDecimal;
		this.converte();
		System.out.println("Convertendo o Decimal: " + this.nDecimal + " Em Binario: " + this.nResult);
		
	}
	
	public String converte() {
		
		for (int i = this.nDecimal; i > 0; i = i/2) {
			
			this.nResto = i%2;	
			this.nResult =  Integer.toString(this.nResto) + this.nResult;
			
		}
		
		return this.nResult;
	}
	
}
