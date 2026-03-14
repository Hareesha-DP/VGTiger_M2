package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//td[@class='tabUnSelected']/a[text()='Leads']")
	private WebElement leadsMenu;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactsMenu;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountsIcon;
	
	@FindBy (xpath = "//a[text()='Sign Out']")
	private WebElement signout;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

	public WebElement getContactsMenu() {
		return contactsMenu;
	}

	public WebElement getAccountsIcon() {
		return accountsIcon;
	}

	public WebElement getSignout() {
		return signout;
	}
	
	public void clickLeads() {
		getLeadsMenu().click();
	}
	
	public void clickContacts() {
		getContactsMenu().click();
	}
	
	public void signoutOperation() {
		getAccountsIcon().click();
		getSignout().click(); 
	}

}
