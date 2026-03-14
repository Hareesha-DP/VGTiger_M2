package testCaseRepo;

import java.io.IOException;

import org.testng.annotations.Test;

import ObjectRepo.ContactsPage;
import ObjectRepo.CreateNewContactsPage;
import ObjectRepo.HomePage;
import genericUtility.BaseClass;

public class TC_006 extends BaseClass {

	
	@Test(groups = {"regression","smoke"})
	public void CON_003() throws IOException {
		
		HomePage hp = new HomePage(driver);
		hp.clickContacts();
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreateNewContactsIcon();
		String Lname = eUtil.getSingleCellDataFromExcelFile("Contacts", 7 , 1);
		String department = eUtil.getSingleCellDataFromExcelFile("Contacts", 7 , 2);
		String email = eUtil.getSingleCellDataFromExcelFile("Contacts", 7 , 3);
		String mailingCity = eUtil.getSingleCellDataFromExcelFile("Contacts", 7, 4);
		String mailingState = eUtil.getSingleCellDataFromExcelFile("Contacts", 7, 5);
		String mailingCountry = eUtil.getSingleCellDataFromExcelFile("Contacts", 7, 6);
		CreateNewContactsPage cncp = new CreateNewContactsPage(driver);
		cncp.createNewContacts(Lname, department, email, mailingCity, mailingState, mailingCountry);
		
	}

}


