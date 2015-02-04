package com.ibanheiz;

import java.util.Map;

import org.json.JSONObject;

public class GeradorMensagemJson extends GeradorMensagem {

	@Override
	protected String gerarConteudo(Map<String, String> pessoa) {
		JSONObject json = new JSONObject(pessoa);
		return json.toString();
	}

	@Override
	protected void exibirCoteudo(String conteudo) {
		System.out.println("Gerando conteúdo em JSON");
		System.out.println(conteudo);
	}

}
