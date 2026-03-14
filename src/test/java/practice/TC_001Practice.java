package practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepo.CreateNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import ObjectRepo.LoginPage;
import genericUtility.ExcelUtility;
import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;

public class TC_001Practice {
	@Test
	public void m1() throws IOException {
		ExcelUtility eUtil = new ExcelUtility ();
		PropertiesUtility pUtil = new PropertiesUtility();
		SeleniumUtility sUtil = new SeleniumUtility();
		WebDriver driver = new ChromeDriver();
		sUtil.maximizeWindow(driver);
		sUtil.implicitWait(driver, 20);
		String URL = pUtil.getDataFromProperties("url");
		String UN = pUtil.getDataFromProperties("username");
		String PWD = pUtil.getDataFromProperties("password");
		sUtil.accessApplication(driver, URL);
		LoginPage lp = new LoginPage(driver);
		lp.loginToApplication(UN, PWD);
		HomePage hp = new HomePage(driver);
		hp.clickLeads();
		LeadsPage lep = new LeadsPage(driver);
		lep.clickOnCreateNewLeadsIcon();
		String fName = eUtil.getSingleCellDataFromExcelFile("Leads", 1, 2);
		String lName = eUtil.getSingleCellDataFromExcelFile("Leads", 1, 2);
		String company = eUtil.getSingleCellDataFromExcelFile("Leads", 1, 3);
		CreateNewLeadPage cnlp = new CreateNewLeadPage(driver);
		cnlp.createNewLead(fName, lName, company);
		hp.signoutOperation();
		driver.quit();
		
	}

}
