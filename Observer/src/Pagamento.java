
public class Pagamento implements Observer {

	@Override
	public void efetuarCompra(Produto produto) {
		System.out.println("Pagamento no valor de " + produto.getValor() + " para um(a) " + produto.getNome());
	}

}
