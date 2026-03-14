package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ObjectRepo.CreateNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import ObjectRepo.LoginPage;
import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;

public class POMPractice {
	
	@FindBy(name="user_name")
	WebElement usernameTF;
	
	public POMPractice(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public static void main(String[] args) throws IOException, InterruptedException {
	    PropertiesUtility pUtil = new PropertiesUtility();
		SeleniumUtility sUtil = new SeleniumUtility();
		String URL = pUtil.getDataFromProperties("url");
		String UN = pUtil.getDataFromProperties("username");
		String PW = pUtil.getDataFromProperties("password");
		WebDriver driver = new ChromeDriver();
		sUtil.maximizeWindow(driver);
		sUtil.implicitWait(driver, 15);
		sUtil.accessApplication(driver, URL);
//		POMPractice p= new POMPractice(driver);
//		p.usernameTF.sendKeys(UN);
//		WebElement usernameTF = driver.findElement(By.xpath("//input[@type='text']"));
//		usernameTF.sendKeys(UN);
//		Thread.sleep(2000);
//		sUtil.refreshCurrentPage(driver);
//		p.usernameTF.sendKeys(UN);
		LoginPage l = new LoginPage(driver);
		l.loginToApplication(UN, PW);
		
		
		
		HomePage hp = new HomePage(driver);
		hp.clickLeads();
//		hp.clickContacts();
//		hp.signoutOperation();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadsIcon();
		
//		CreateNewLeadPage cnlp = new CreateNewLeadPage(driver);
		
		
			
	}

}
