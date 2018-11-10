package com.michel.atividade1.classes;

public class Fatorial {
	
	private int nrFatorial;
	private int nrResultado = 0;
	
	public Fatorial(int nrFatorial) {
		
		this.nrFatorial = nrFatorial;
		this.nrResultado = nrFatorial;
		
	}
	
	public int retornaFatorial () {
		
		
		for (int i = this.nrFatorial-1; i >= 1; i--) {
			
			this.nrResultado = this.nrResultado * i;
			// o codigo abaixo funciona, mais o codigo acima fica mais limpo. refactoring
			/*if (this.nrResultado == 0) {
				this.nrResultado = i;
			}else {
				this.nrResultado = this.nrResultado * i;
			}*/	
		}
		return this.nrResultado;
	}
}
