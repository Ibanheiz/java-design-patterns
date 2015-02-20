public class Produto {

	private String codigoBarras;
	private String nome;
	private double valor;

	public Produto(String codigoBarras, String nome, double valor) {
		super();
		this.codigoBarras = codigoBarras;
		this.nome = nome;
		this.valor = valor;
	}

	/**
	 * @return the codigoBarras
	 */
	public String getCodigoBarras() {
		return codigoBarras;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}

}
