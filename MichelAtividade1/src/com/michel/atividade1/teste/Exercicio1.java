package com.michel.atividade1.teste;

import com.michel.atividade1.classes.Array;
//invertendo os arrays

public class Exercicio1 {

	public static void main(String[] args) {
		
		Array testeArray = new Array(5);
		
		testeArray.adiciona(5);
		testeArray.adiciona(4);
		testeArray.adiciona(3);
		
		//System.out.println(testeArray.toString());
		
		testeArray.inverteVetor();
		
		System.out.println(testeArray.toString());
		
						

	}

}
