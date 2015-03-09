public class RecuperadorFeedRemoto extends RecuperadorFeed {

	private String feedNoticias;

	@Override
	protected String recuperarFeedNoticias() {
		System.out.println("Recuperando Feed de Notícias de um Web Service");
		feedNoticias = "{titulo: São Paulo perde novamente para o Corinthians em pleno Morumbi, data: 09/03/2015}";
		return feedNoticias;
	}

}
