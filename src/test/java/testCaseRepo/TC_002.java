package testCaseRepo;

import java.io.IOException;

import org.testng.annotations.Test;

import ObjectRepo.CreateNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import genericUtility.BaseClass;

public class TC_002 extends BaseClass{
	
	@Test(groups = {"regression","smoke"})
	public void LE_002() throws IOException {
		HomePage hp = new HomePage(driver);
		hp.clickLeads();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadsIcon();
		String Lname = eUtil.getSingleCellDataFromExcelFile("leads", 4, 1);
		String company = eUtil.getSingleCellDataFromExcelFile("leads", 4, 2);
		String title = eUtil.getSingleCellDataFromExcelFile("leads", 4, 3);
		String LeadSource = eUtil.getSingleCellDataFromExcelFile("leads", 4, 4);
		String noOfEmployees = eUtil.getSingleCellDataFromExcelFile("leads", 4, 5);
		CreateNewLeadPage cnlp = new CreateNewLeadPage (driver);
		cnlp.createNewLead(Lname, company, title, LeadSource, noOfEmployees);
		
	}

}
