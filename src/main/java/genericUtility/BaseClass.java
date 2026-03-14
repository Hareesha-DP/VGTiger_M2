package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import ObjectRepo.HomePage;
import ObjectRepo.LoginPage;

public class BaseClass {
	
	public ExcelUtility eUtil = new ExcelUtility();
	public SeleniumUtility sUtil = new SeleniumUtility();
	public PropertiesUtility pUtil = new PropertiesUtility();
	public WebDriver driver;
	public static WebDriver sDriver;
	
	@BeforeSuite (alwaysRun = true)
	public void bsConfig() {
		System.out.println("Create DB Connection");
	}
	
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void bcConfig(@Optional("chrome") String browser) throws IOException {
//		String browser = "edge";
		if(browser.equals("chrome"))
			driver=new ChromeDriver();
		else if(browser.equals("edge")) {
//		System.setProperty("webdriver.edge.driver" , ".\\src\\main\\resources\\Drivers\\msedgedriver.exe");//only when edge browser not working 
			driver=new EdgeDriver();
			}
		else if (browser.equals("firfox"))
			driver = new FirefoxDriver();
		else
			driver = new ChromeDriver();
		sDriver = driver;
//		driver = new ChromeDriver();
		sUtil.maximizeWindow(driver);
		sUtil.implicitWait(driver, 20);
		String URL = pUtil.getDataFromProperties("url");
		sUtil.accessApplication(driver, URL);
		System.out.println("Launching browser successfully");
	}
	
	@BeforeMethod (alwaysRun = true)
	public void bmConfig() throws IOException {
		String UN = pUtil.getDataFromProperties("username");
		String PWD = pUtil.getDataFromProperties("password");
		LoginPage lp = new LoginPage(driver);
		lp.loginToApplication(UN, PWD);
		System.out.println("Login Done Successfully");
		
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void amConfig() {
		HomePage hp = new HomePage(driver);
		hp.signoutOperation();
		System.out.println("signOut done successfully");
	}
	
	@AfterClass(alwaysRun = true)
	public void acConfig() {
		driver.quit();
		System.out.println("Browser closed successfully");
	}
	
	@AfterSuite(alwaysRun = true)
	public void asConfig() {
		System.out.println("DB Connection Closed");
	}

}
