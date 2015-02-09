package com.ibanheiz;

public class EstadoDesligado implements Estado {

	@Override
	public void fazerAcao(Contexto contexto) {
		System.out.println("Desligando...");
		contexto.setEstado(this);
	}

	@Override
	public String toString() {
		return "Contexto está desligado";
	}
}
