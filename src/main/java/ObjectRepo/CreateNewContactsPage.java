package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactsPage {
	
	@FindBy(name = "firstname")
	private WebElement firstNameTF;
	
	@FindBy(name = "lastname")
	private WebElement lastNameTF;
	
	@FindBy(name = "title")
	private WebElement titleTF;
	
	@FindBy(name = "department")
	private WebElement departmentTF;
	
	@FindBy(name = "email")
	private WebElement emailTF;
	
	@FindBy(name = "mobile")
	private WebElement mobileTF;
	
	@FindBy(name = "mailingcity")
	private WebElement mailingCityTF;
	
	@FindBy(name = "mailingstate")
	private WebElement mailingStateTF;
	
	@FindBy(name = "mailingcountry")
	private WebElement mailingCountryTF;
	
	@FindBy(xpath = "//input[@class='crmbutton small save']")
	private WebElement saveButton;
	
	
	
	public CreateNewContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getFirstNameTF() {
		return firstNameTF;
	}


	public WebElement getLastNameTF() {
		return lastNameTF;
	}


	public WebElement getTitleTF() {
		return titleTF;
	}


	public WebElement getDepartmentTF() {
		return departmentTF;
	}


	public WebElement getEmailTF() {
		return emailTF;
	}


	public WebElement getMobileTF() {
		return mobileTF;
	}


	public WebElement getMailingCityTF() {
		return mailingCityTF;
	}


	public WebElement getMailingStateTF() {
		return mailingStateTF;
	}


	public WebElement getMailingCountryTF() {
		return mailingCountryTF;
	}


	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
	public void createNewContacts(String firstName , String lastName, String title) {
		getFirstNameTF().sendKeys(firstName);
		getLastNameTF().sendKeys(lastName);
		getTitleTF().sendKeys(title);
		getSaveButton().click();
		
	}
	
	public void createNewContacts(String lastName, String department, String email, String mobile ) {
		getLastNameTF().sendKeys(lastName);
		getDepartmentTF().sendKeys(department);
		getEmailTF().sendKeys(email);
		getMobileTF().sendKeys(mobile);
		getSaveButton().click();
			
	}
	
	public void createNewContacts(String lastName, String department, String email, String mailingCity, String mailingState,String mailingCountry) {
		getLastNameTF().sendKeys(lastName);
		getDepartmentTF().sendKeys(department);
		getEmailTF().sendKeys(email);
		getMailingCityTF().sendKeys(mailingCity);
		getMailingStateTF().sendKeys(mailingState);
		getMailingCountryTF().sendKeys(mailingCountry);
		getSaveButton().click();
		 
	}

}
