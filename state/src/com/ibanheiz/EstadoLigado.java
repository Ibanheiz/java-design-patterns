package com.ibanheiz;

public class EstadoLigado implements Estado {

	@Override
	public void fazerAcao(Contexto contexto) {
		System.out.println("Ligando...");
		contexto.setEstado(this);
	}

	@Override
	public String toString() {
		return "Contexto está ligado";
	}
	
}
