package com.michel.exercicio.aula.teste;

import com.michel.exercicio.aula.classes.ContaPoupanca;

public class TesteContaPupanca {

	public static void main(String[] args) {
		
		ContaPoupanca cp1 = new ContaPoupanca("1", "2", "3");
		cp1.deposita(1000);
		System.out.println(cp1.getSaldo());
		System.out.println(cp1.getClassificacao());

	}

}
