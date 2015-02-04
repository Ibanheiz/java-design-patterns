package com.ibanheiz.factory;

import com.ibanheiz.model.Cerveja;

public abstract class CervejaFactory {

	/**
	 * @author Nicolas Ibanheiz
	 * @return Cerveja criada a partir da implementação
	 */
	public abstract Cerveja criarCerveja();
	
}
