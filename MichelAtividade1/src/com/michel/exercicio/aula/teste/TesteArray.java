package com.michel.exercicio.aula.teste;

import com.michel.exercicio.aula.classes.Array;

public class TesteArray {

	public static void main(String[] args) {
		
		Array a1 = new Array(5);
		a1.adicionaValores(1000);
		a1.adicionaValores(2000);
		a1.adicionaValores(3000);
		a1.adicionaValores(60);
		a1.adicionaValores(60);
		a1.adicionaValores(60);
		a1.MaxMinSumMed();

	}

}
