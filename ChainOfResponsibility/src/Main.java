public class Main {
	public static void main(String[] args) {
		RecuperadorFeed recuperadorFeedCache = new RecuperadorFeedCache();
		RecuperadorFeed recuperadorFeedDB = new RecuperadorFeedDB();
		RecuperadorFeed recuperadorFeedRemoto = new RecuperadorFeedRemoto();
		
		recuperadorFeedCache.setProximo(recuperadorFeedDB);
		recuperadorFeedDB.setProximo(recuperadorFeedRemoto);
		
		System.out.println(recuperadorFeedCache.recuperar());
	}
}
