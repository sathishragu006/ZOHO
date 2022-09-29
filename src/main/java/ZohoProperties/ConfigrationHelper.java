package ZohoProperties;

import java.io.IOException;

public class ConfigrationHelper {
	public static  ConfigrationReader getInstance() throws IOException {

		ConfigrationReader cr= new ConfigrationReader();
		return cr;
	}
	private ConfigrationHelper(){
		
	}
}



