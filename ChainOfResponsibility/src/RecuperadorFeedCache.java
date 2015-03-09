
public class RecuperadorFeedCache extends RecuperadorFeed {
	
	private String feedNoticias;
	
	public RecuperadorFeedCache() {
	}
	
	@Override
	protected String recuperarFeedNoticias() {
		System.out.println("Feed de Noticias ausente no cache");
		return feedNoticias;
	}

}
