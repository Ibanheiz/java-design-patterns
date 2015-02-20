public class Estoque implements Observer {

	@Override
	public void efetuarCompra(Produto produto) {
		System.out.println("1 Produto " + produto.getNome() + " foi removido do estoque");
	}

}
