package com.ibanheiz;

import java.util.Map;

public class GeradorMensagemXml extends GeradorMensagem {

	@Override
	protected String gerarConteudo(Map<String, String> pessoa) {
		StringBuilder builder = new StringBuilder();
		builder.append("<pessoa>");
		for (String tag : pessoa.keySet()) {
			builder.append("<" + tag + ">" + pessoa.get(tag) + "</" + tag + ">");
		}
		builder.append("</pessoa>");
		return builder.toString();
	}

	@Override
	protected void exibirCoteudo(String conteudo) {
		System.out.println("Gerando conteúdo em XML");
		System.out.println(conteudo);
	}

}
