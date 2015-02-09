package com.ibanheiz;

public class Main {
	public static void main(String[] args) {
		Contexto contexto = new Contexto();
		Estado estadoLigado = new EstadoLigado();
		Estado estadoDesligado = new EstadoDesligado();
		
		estadoLigado.fazerAcao(contexto);
		System.out.println(contexto.getEstado());
		
		estadoDesligado.fazerAcao(contexto);
		System.out.println(contexto.getEstado());
	}
}
