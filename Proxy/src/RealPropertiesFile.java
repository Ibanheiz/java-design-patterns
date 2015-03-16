
public class RealPropertiesFile implements PropertiesFile {
	
	private String fileName;
	
	public RealPropertiesFile(String fileName) {
		this.fileName = fileName;
		loadFile(fileName);
	}

	@Override
	public void getFileName() {
		System.out.println("Arquivo de properties: " + fileName);
	}
	
	private void loadFile(String fileName) {
		System.out.println("Carregando arquivo do HD: " + fileName);
	}
}
