public class Main {
	public static void main(String[] args) {
		Compra compra = new Compra();
		Pagamento pagamento = new Pagamento();
		Estoque estoque = new Estoque();
		
		compra.addObserver(pagamento);
		compra.addObserver(estoque);
		
		Produto produto = new Produto("000001", "Cerveja", 3.0);
		compra.finalizarCompra(produto);
	}
}
