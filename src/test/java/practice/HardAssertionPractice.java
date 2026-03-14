package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPractice {
	
	@Test
	public void strictLevelComparisionHardAssertion() {
		String expectedCity = "mysore";
		String actualCity = "mysuru";
		System.out.println("Strict Level Hard Assertion Starts");
		Assert.assertEquals(actualCity, expectedCity);
		System.out.println("Strict Level Hard Assertion ends");
	}
	
	@Test
	public void containsLevelHardAssertion() {
		String expectedName = "Babu";
		String actualName = "Giri Babu";
		System.out.println("Contain Level Hard Assertion Stars");
		Assert.assertTrue(actualName.contains(expectedName));
		Assert.assertEquals(actualName.contains(expectedName), true);
		System.out.println("Contains Level Hard Assertion Ends");
		
	}
}
