package com.ibanheiz;

public abstract class Frete {

	/**
	 * Calcula o valor do frete
	 * @author Nicolas Ibanheiz
	 * @param cepOrigem cep do local de origem da viagem
	 * @param cepDestino cep do destino da viagem
	 * @return valor do frete calculado
	 */
	public abstract double calcular(String cepOrigem, String cepDestino, NotaFiscal notaFiscal);
}
