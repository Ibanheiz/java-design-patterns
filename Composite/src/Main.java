
public class Main {

	public static void main(String[] args) {
		// Montando uma cesta básica
		CestaBasica cestaBasica = new CestaBasica("Cesta básica da empresa");
		Produto arroz = new Arroz("Tio João", 4.0, 1);
		Produto feijao = new Feijao("Camil", 4.8, 1);
		Produto macarrao = new Macarrao("Adria", 2.7, 2);
		
		cestaBasica.addProduto(arroz);
		cestaBasica.addProduto(feijao);
		cestaBasica.addProduto(macarrao);
		
		System.out.println("Nome da cesta: " + cestaBasica.getNome());
		System.out.println("Preço (com desconto): " + cestaBasica.getPreco());
		System.out.println("Quantidade de itens: " + cestaBasica.getQuantidade());
	}
}
