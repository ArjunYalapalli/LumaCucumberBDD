package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	static Properties prop;

	public static Properties getProperties() {
		
		prop = new Properties();
		
		try {
			
			FileInputStream file = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Documents\\Desktop\\New folder (2)\\Luma_Cucumber\\src\\test\\resource\\prop.properties");
			// FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resource\\prop.properties");
			
			prop.load(file);
			
		} catch (Exception e) {

		}
		
		return prop;
	}

}
