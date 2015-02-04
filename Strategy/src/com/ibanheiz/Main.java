package com.ibanheiz;

public class Main {

	public static void main(String[] args) {
		CalcularFrete calcularFrete = new CalcularFrete();
		Frete frete = new FreteFracionado();
		
		calcularFrete.setFrete(frete);
		System.out.println("Valor do frete fracionado: R$" + calcularFrete.valorFrete());
		
		frete = new FreteLotacao();
		calcularFrete.setFrete(frete);
		System.out.println("Valor do frete lotação: R$" + calcularFrete.valorFrete());
	}
}
