package testCaseRepo;

import java.io.IOException;

import org.testng.annotations.Test;

import ObjectRepo.ContactsPage;
import ObjectRepo.CreateNewContactsPage;
import ObjectRepo.HomePage;
import genericUtility.BaseClass;

public class TC_005 extends BaseClass {
	
	
	@Test(groups = {"smoke"})
	public void CON_002() throws IOException {
		
		HomePage hp = new HomePage(driver);
		hp.clickContacts();
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreateNewContactsIcon();
		String Lname = eUtil.getSingleCellDataFromExcelFile("Contacts", 4 , 1);
		String department = eUtil.getSingleCellDataFromExcelFile("Contacts", 4 , 2);
		String email = eUtil.getSingleCellDataFromExcelFile("Contacts", 4 , 3);
		String phone = eUtil.getSingleCellDataFromExcelFile("contacts", 4, 4);
		CreateNewContactsPage cncp = new CreateNewContactsPage(driver);
		cncp.createNewContacts(Lname, department, email, phone);
		
		
	}

}

