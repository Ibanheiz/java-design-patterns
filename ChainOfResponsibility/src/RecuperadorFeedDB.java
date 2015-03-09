public class RecuperadorFeedDB extends RecuperadorFeed {

	private String feedNoticias;

	@Override
	protected String recuperarFeedNoticias() {
		System.out.println("Feed de Noticias ausente no banco de dados");
		return feedNoticias;
	}
}
