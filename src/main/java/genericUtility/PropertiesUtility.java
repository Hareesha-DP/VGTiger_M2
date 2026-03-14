package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This is an Utility class to perform data driven from properties file.
 * @author Hareesha D P
 * @version 26-02-02
 */

public class PropertiesUtility {
	
	/**
	 * This is an Utility method  to fetch data from properties file.
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String getDataFromProperties(String key) throws IOException {
		FileInputStream fis = new FileInputStream(IPathUtility.propertiesPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	
	/**
	 * This is an Utility method to write data to properties file.
	 * @param key
	 * @param value
	 * @param message
	 * @throws IOException
	 */
	
	public void writeDataToPropertiesFile(String key , String value , String message) throws IOException {
		FileInputStream fis = new FileInputStream(IPathUtility.propertiesPath);
		Properties prop = new Properties();
		prop.load(fis);
		prop.setProperty(key, value);
		FileOutputStream fos = new FileOutputStream (IPathUtility.propertiesPath);
		prop.store(fos, message);
			
	}

}

