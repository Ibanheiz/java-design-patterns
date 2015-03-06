import java.util.ArrayList;
import java.util.List;


public class CestaBasica implements Produto {
	
	private String nome;
	private List<Produto> produtos;

	public CestaBasica(String nome) {
		this.nome = nome;
		produtos = new ArrayList<Produto>();
	}
	
	public void addProduto(Produto produto){
		produtos.add(produto);
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public double getPreco() {
		double precoSemDesconto = 0.0;
		for (Produto produto : produtos) {
			precoSemDesconto += produto.getPreco();
		}
		// 20% de desconto
		return precoSemDesconto - ((precoSemDesconto * 20) / 100);
	}

	@Override
	public int getQuantidade() {
		int quantidade = 0;
		for (Produto produto : produtos) {
			quantidade += produto.getQuantidade();
		}
		return quantidade;
	}
}
