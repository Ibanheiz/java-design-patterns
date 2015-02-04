package com.ibanheiz.factory;

import com.ibanheiz.model.BadenBaden;
import com.ibanheiz.model.Cerveja;

public class BadenBadenFactory extends CervejaFactory {

	@Override
	public Cerveja criarCerveja() {
		return new BadenBaden();
	}

}
