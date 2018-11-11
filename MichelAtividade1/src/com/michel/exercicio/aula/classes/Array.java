package com.michel.exercicio.aula.classes;

public class Array {
	
	private int[] nArray;
	private int nElementoAtual = 0;
	private int nElementos;
	
	private int nSoma = 0;
	private int nMax = 0;
	private int nMin = 0;
	private int nMedia = 0;
	
	public Array(int elementos) {
		
		this.nArray = new int [elementos];
		this.nElementos = elementos;
		
	}
	
	public boolean adicionaValores(int nValores) {
	
		if (this.nElementoAtual >= nElementos -1 ) {
			System.out.println("Nao adiciona mais valores");
			return false;
			
		}
		
		this.nArray[this.nElementoAtual] = nValores;
		
		this.nSoma += nValores;
		if (this.nElementoAtual == 0) {
			this.nMin = nValores;
		}else if (nValores < this.nMin) {
			this.nMin = nValores;
		}
		if (nValores > this.nMax) {
			this.nMax = nValores;
		}
		this.nElementoAtual++;
		return true;
	}
	
	public void MaxMinSumMed() {
		
		System.out.println("Max: "+this.nMax);
		System.out.println("Min: "+this.nMin);
		System.out.println("Soma: "+this.nSoma);
		System.out.println("Media: " + (this.nSoma/this.nElementoAtual));
		
		
	}
	

}
