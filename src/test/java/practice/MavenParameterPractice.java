package practice;

import org.testng.annotations.Test;

public class MavenParameterPractice {
	
	@Test
	public void m1() {
		String UN = System.getProperty("username");
		String PWD = System.getProperty("password");
		System.out.println(UN);
		System.out.println(PWD);
	}
}
