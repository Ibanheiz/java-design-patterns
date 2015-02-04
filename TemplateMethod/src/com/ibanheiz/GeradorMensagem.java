package com.ibanheiz;

import java.util.Map;

public abstract class GeradorMensagem {
	
	public final void gerarMensagem(Map<String, String> pessoa) {
		String conteudo = gerarConteudo(pessoa);
		exibirCoteudo(conteudo);
	}

	/**
	 * Gera o conteúdo da mensagem para cada implementação
	 * @author Nicolas Ibanheiz
	 * @param pessoa Map com as propriedades da pessoa
	 * @return conteudo formatado
	 */
	protected abstract String gerarConteudo(Map<String, String> pessoa);
	
	/**
	 * Exibe o conteúdo específico de cada implementação
	 * @author Nicolas Ibanheiz
	 * @param conteudo para ser exibido
	 */
	protected abstract void exibirCoteudo(String conteudo);
	
}
