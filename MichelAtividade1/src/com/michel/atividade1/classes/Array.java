package com.michel.atividade1.classes;

import java.util.Arrays;

<<<<<<< HEAD
public class Array {//um comentario
=======
public class Array {
>>>>>>> master
	
	
	private int[] array;
	private int[] arrayInvertido;
	private int tamanho =0;
		
	public Array(int tamanho) {
		
		this.array = new int [tamanho];
		this.arrayInvertido = new int [tamanho];
		
	}
		
	public boolean adiciona(int elemento) {
		
		if(this.tamanho < this.array.length) {
			
			this.array[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	public void inverteVetor() {
		
		for (int i=0; i < this.array.length; i++) {
			
			this.arrayInvertido[this.arrayInvertido.length-i-1] =this.array[i]; 
			
		}
		
		this.array = this.arrayInvertido;
		
	}

	@Override
	public String toString() {
		return "Array [array=" + Arrays.toString(array) + ", arrayInvertido=" + Arrays.toString(arrayInvertido)
				+ ", tamanho=" + tamanho + "]";
	}
	
	
	


	
	
	
}
