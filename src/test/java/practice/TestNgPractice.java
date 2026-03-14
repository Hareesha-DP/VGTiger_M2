package practice;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(genericUtility.ListenersImplementation.class)
public class TestNgPractice {
	
	@Test(priority = 1 /* enabled = false , invocationCount = 0 */)
	public void createUser() {
		System.out.println("user created");
	}
	
	
	@Test(priority = 2, dependsOnMethods = {"deleteUser"})
	public void modifier() {
		System.out.println("user modified");
	}
	
	@Test(priority = 3)
	public void deleteUser() {
		Assert.fail();
		System.out.println("user deleted");
	}

}
