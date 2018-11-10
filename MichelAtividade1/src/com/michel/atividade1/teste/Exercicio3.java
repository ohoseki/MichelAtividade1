package com.michel.atividade1.teste;

import javax.swing.JOptionPane;

import com.michel.atividade1.classes.Funcionarios;

public class Exercicio3 {

	public static void main(String[] args) {

		Funcionarios f1 = new Funcionarios(new Integer(JOptionPane.showInputDialog("Quantidade de Funcionarios")));

		for (int i = 0; i < f1.getElementosArray(); i++) {
			f1.adicionaFuncionarios(JOptionPane.showInputDialog("Informe o CPF"),
					JOptionPane.showInputDialog("Informe o nome"), new Double(JOptionPane.showInputDialog("Salario1")));
		}
		
		System.out.println(f1.toString());
		System.out.println("A media Salarial desta empresa e: " + f1.retornaMediaSalarial());
	}

}
