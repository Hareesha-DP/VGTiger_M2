package testCaseRepo;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepo.CreateNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import genericUtility.BaseClass;

@Listeners(genericUtility.ListenersImplementation.class)
public class TC_001 extends BaseClass {
	
	int i=1; 
	
	@Test (groups = {"smoke","sanity"} , retryAnalyzer = genericUtility.RetryAnaliyzerImplementation.class)
	public void LE_001() throws IOException {
		HomePage hp = new HomePage(driver);
		hp.clickLeads();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadsIcon();
		if(i<=3) {
			i++;
			Assert.fail();
		}
		Assert.fail();
		String Fname = eUtil.getSingleCellDataFromExcelFile("leads", 1, 1);
		String Lname = eUtil.getSingleCellDataFromExcelFile("leads", 1, 2);
		String company = eUtil.getSingleCellDataFromExcelFile("leads", 1, 3);
		CreateNewLeadPage cnlp = new CreateNewLeadPage(driver);
		cnlp.createNewLead(Fname, Lname, company);
	}

}
