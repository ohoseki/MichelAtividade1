package com.michel.exercicio.aula.teste;

import com.michel.exercicio.aula.classes.*;
import java.util.EnumSet;




public class TesteEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ClassificacaoCliente.Potencial.getVlrMax());
		
		System.out.println(ClassificacaoCliente.Potencial.isCompatible(1000));
	}

}
