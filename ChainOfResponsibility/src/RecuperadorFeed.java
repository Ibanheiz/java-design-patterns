
public abstract class RecuperadorFeed {

	private RecuperadorFeed proximo;
	
	public String recuperar() {
		String feedNoticias = recuperarFeedNoticias();
		if (feedNoticias == null) {
			return proximo.recuperar();
		} else {
			return feedNoticias;
		}
	}
	
	protected abstract String recuperarFeedNoticias();
	
	public void setProximo(RecuperadorFeed proximo) {
		if (this.proximo == null) {
			this.proximo = proximo;
		} else {
			this.proximo = proximo;
			proximo.setProximo(proximo);
		}
	}
}
