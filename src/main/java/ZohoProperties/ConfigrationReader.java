package ZohoProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigrationReader {
	private Properties p;

	public ConfigrationReader() throws IOException {
		File f = new File(
				"C:\\Users\\Sathish\\eclipse-workspace\\zoho\\src\\main\\java\\ZohoProperties\\zoho.propeties");

		FileInputStream fi = new FileInputStream(f);

		p = new Properties();

		p.load(fi);

	}

	public String getBrowser() {

		String browser = p.getProperty("browser");
		return browser;
	}

	public String getUrl() {

		String url = p.getProperty("url");
		return url;
	}

	public String getEmail() {
		String email = p.getProperty("email");
		return email;
	}

	public String getPassword() {

		String url = p.getProperty("password");
		return url;
	}

}
