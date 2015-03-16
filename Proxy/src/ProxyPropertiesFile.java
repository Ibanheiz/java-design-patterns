public class ProxyPropertiesFile implements PropertiesFile {

	private RealPropertiesFile properties;
	private String fileName;

	public ProxyPropertiesFile(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void getFileName() {
		if (properties == null) {
			properties = new RealPropertiesFile(fileName);
		}
		properties.getFileName();
	}

}
