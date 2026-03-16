package testCaseRepo;

import java.io.IOException;

import org.testng.annotations.Test;

import ObjectRepo.ContactsPage;
import ObjectRepo.CreateNewContactsPage;
import ObjectRepo.HomePage;
import genericUtility.BaseClass;

public class TC_004 extends BaseClass {
	
	
	@Test(groups = {"regression","sanity"})
	public void CON_001() throws IOException {
		
		HomePage hp = new HomePage(driver);
		hp.clickContacts();
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreateNewContactsIcon();
		String Fname = eUtil.getSingleCellDataFromExcelFile("Contacts", 1 , 1);
		String Lname = eUtil.getSingleCellDataFromExcelFile("Contacts", 1 , 2);
		String title = eUtil.getSingleCellDataFromExcelFile("Contacts", 1 , 3);
		CreateNewContactsPage cncp = new CreateNewContactsPage(driver);
		cncp.createNewContacts(Fname, Lname, title);
		
		
		
	}

}
