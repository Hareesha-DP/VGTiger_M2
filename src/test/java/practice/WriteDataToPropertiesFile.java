package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataToPropertiesFile {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Hareesha D P\\Desktop\\propertiesfiles\\file.properties");
		Properties prop = new Properties();
		prop.load(fis);
		prop.setProperty("email", "robin@gmail.com");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Hareesha D P\\Desktop\\propertiesfiles\\file.properties");
		prop.store(fos, "email updated");
		
	}

}

