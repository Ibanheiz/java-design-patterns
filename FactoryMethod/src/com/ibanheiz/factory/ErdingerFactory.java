package com.ibanheiz.factory;

import com.ibanheiz.model.Cerveja;
import com.ibanheiz.model.Erdinger;

public class ErdingerFactory extends CervejaFactory {

	@Override
	public Cerveja criarCerveja() {
		return new Erdinger();
	}

}
