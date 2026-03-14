package practice;

import java.io.IOException;

import genericUtility.PropertiesUtility;

public class Practice1 {
	public static void main(String[] args) throws IOException {
		
		PropertiesUtility putility  = new PropertiesUtility();
		String url = putility.getDataFromProperties("url");
		String UN = putility.getDataFromProperties("username");
		String PW = putility.getDataFromProperties("password");
		
		System.out.println(url);
		System.out.println(UN);
		System.out.println(PW);
		
		
		putility.writeDataToPropertiesFile("user", "hareesha", "message updated");
	}

}

