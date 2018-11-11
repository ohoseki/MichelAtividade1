package com.michel.exercicio.aula.teste;

import com.michel.exercicio.aula.classes.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente c1 = new Cliente("44444", "33333", "ruma pedro", "Rafael Ohsoeki");
		Cliente c2 = new Cliente("111", "222", "rafa", "rafa2");
		
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		
	}

}
