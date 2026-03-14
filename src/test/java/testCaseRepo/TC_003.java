package testCaseRepo;

import java.io.IOException;

import org.testng.annotations.Test;

import ObjectRepo.CreateNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import genericUtility.BaseClass;

public class TC_003 extends BaseClass{
	
	@Test(groups = {"regression","smoke"})
	public void LE_003() throws IOException {
		HomePage hp = new HomePage(driver);
		hp.clickLeads();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadsIcon();
		String Lname = eUtil.getSingleCellDataFromExcelFile("Leads", 7, 1);
		String company = eUtil.getSingleCellDataFromExcelFile("Leads", 7, 2);
		String noOfEmployyes = eUtil.getSingleCellDataFromExcelFile("Leads", 7, 3);
		String phone = eUtil.getSingleCellDataFromExcelFile("Leads", 7, 4);
		String emial = eUtil.getSingleCellDataFromExcelFile("Leads", 7, 5);
		String state = eUtil.getSingleCellDataFromExcelFile("Leads", 7, 6);
		String country = eUtil.getSingleCellDataFromExcelFile("Leads", 7, 7);
		CreateNewLeadPage cnlp = new CreateNewLeadPage(driver);
		cnlp.createNewLead(Lname, company, noOfEmployyes, phone, emial, state, country);
		
		
	}

}
