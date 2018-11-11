package com.michel.exercicio.aula.teste;

import com.michel.exercicio.aula.classes.*;

public class TesteContaEspecial {

	public static void main(String[] args) {
	
			ContaEspecial r1 = new ContaEspecial();
			r1.deposita(1000);
			System.out.println(r1.getSaldo());
			r1.saque(100);
			System.out.println(r1.getSaldo());
			System.out.println(r1.getTaxaBancaria());
			System.out.println(r1.getTaxaBancaria(10, 2));
		
	}

}
