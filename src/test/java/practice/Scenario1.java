package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {
	public static void main(String[] args) throws IOException, AWTException {
		
		FileInputStream fle = new FileInputStream("C:\\Users\\Hareesha D P\\Desktop\\propertiesfiles\\file1.properties");
		Properties prop = new Properties();
		prop.load(fle);
		String url = prop.getProperty("url");
		String un = prop.getProperty("username");
		String pw = prop.getProperty("password");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pw);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
