package com.michel.atividade1.teste;

import javax.swing.JOptionPane;

import com.michel.atividade1.classes.Fatorial;

public class Exercicio5 {

	public static void main(String[] args) {
	
		Fatorial f1 = new Fatorial(new Integer(JOptionPane.showInputDialog("Informe o numero que se quer o Faltorial:")));
		
		System.out.println(f1.retornaFatorial());

	}

}
