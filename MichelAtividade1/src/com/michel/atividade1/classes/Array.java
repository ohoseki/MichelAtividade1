package com.michel.atividade1.classes;

public class Array {
	
	
	private int[] array;
	private int carga;
	private int ultimo;
		
	public Array(int tamanho) {
		
		this.array = new int [tamanho];
		
	}
		
	public void adicionaElemento(int elemento) {
				
		for (int i = 0; i < this.ultimo; i++) {
			
			this.array[i] = elemento;	
			this.ultimo = i;
			
		}	
				
	}
	
}
