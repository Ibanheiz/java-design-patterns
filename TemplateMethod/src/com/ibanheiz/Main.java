package com.ibanheiz;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<String, String> pessoa = new HashMap<String, String>();
		pessoa.put("nome", "Nicolas");
		pessoa.put("idade", "20");
		pessoa.put("cpf", "000.000.000-00");
		
		GeradorMensagem geradorMensagem = new GeradorMensagemXml();
		geradorMensagem.gerarMensagem(pessoa);
		System.out.println("======================");
		geradorMensagem = new GeradorMensagemJson();
		geradorMensagem.gerarMensagem(pessoa);
	}
}
