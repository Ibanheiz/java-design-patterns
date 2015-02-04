package com.ibanheiz;

import com.ibanheiz.factory.BadenBadenFactory;
import com.ibanheiz.factory.CervejaFactory;
import com.ibanheiz.factory.ErdingerFactory;
import com.ibanheiz.model.Cerveja;

public class Main {
	public static void main(String[] args) {
		CervejaFactory factory = new ErdingerFactory();
		Cerveja erdinger = factory.criarCerveja();
		erdinger.info();
		
		factory = new BadenBadenFactory();
		Cerveja badenBaden = factory.criarCerveja();
		badenBaden.info();
	}
}
