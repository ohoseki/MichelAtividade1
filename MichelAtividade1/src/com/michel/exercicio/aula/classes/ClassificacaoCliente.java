package com.michel.exercicio.aula.classes;

public enum ClassificacaoCliente {
	
	Potencial(400000.000,500000.000),
	Medio(200000.000,400000.000),
	Baixo(0,200000.000);
	
	private double vlrMax;
	private double vlrMin;
	
	ClassificacaoCliente(double vlrMin, double vlrMax ){
		
		this.vlrMin = vlrMin;
		this.vlrMax = vlrMax;
		
	}
	
	public double getVlrMax() {
		return this.vlrMax;
	}
	
	public double getVlrMin() {
		return this.vlrMin;
	}
	
	public boolean isCompatible(double saldo) {
		
		if (saldo > getVlrMin() && saldo < getVlrMax() ) {		
			return true;
		}else
		return false;
	}
	

	

}
