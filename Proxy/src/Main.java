public class Main {

	public static void main(String[] args) {
		PropertiesFile properties = new ProxyPropertiesFile("system.properties");
		
		// Nome obetido ao carregar o arquivo do disco
		properties.getFileName();
		System.out.println("");
		
		// Imagem obtida através do cache do proxy
		properties.getFileName();
	}
}
