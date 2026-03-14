package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromPropertiesFile {
	public static void main(String[] args) throws IOException, AWTException {
		

	FileInputStream fle = new FileInputStream("C:\\Users\\Hareesha D P\\Desktop\\file.properties");
	Properties prop = new Properties();
	prop.load(fle);
	String url = prop.getProperty("url");
	String un = prop.getProperty("username");
	String pw = prop.getProperty("password");
	System.out.println(url);
	System.out.println(un);
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	driver.findElement(By.id("email")).sendKeys(un);
	driver.findElement(By.id("pass")).sendKeys(pw);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	}
}