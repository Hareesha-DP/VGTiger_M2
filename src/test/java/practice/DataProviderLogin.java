package practice;

import java.util.HashMap;

import org.testng.annotations.DataProvider;

public class DataProviderLogin {
	
	@DataProvider(name = "loginData")
	public Object[][] getData() {
//		Object [][] obj = {{"admin","admin"},{"admin123","admin123"}};
		HashMap<String , String> h1 = new HashMap<String , String>();
		h1.put("username", "admin");
		h1.put("password", "admin");
		HashMap<String , String> h2 = new HashMap<String , String>();
		h2.put("username", "admin123");
		h2.put("password", "admin345");
		Object[][] obj = {{h1},{h2}};
		return obj;
		
	}

}
