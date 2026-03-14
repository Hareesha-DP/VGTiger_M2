package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class CreateNewLeadPage {
	
	//Locating the web element.
	
	@FindBy(name = "firstname")
	private WebElement firstNameTF;
	
	@FindBy(name = "lastname")
	private WebElement lastNameTF;
	
	@FindBy(name = "company")
	private WebElement companyTF;
	
	@FindBy(name = "designation")
	private WebElement titleTF;
	
	@FindBy(name = "leadsource")
	private WebElement leadsourceDropdown;
	
	@FindBy(name = "noofemployees")
	private WebElement noOfEmployeesTF;
	
	@FindBy(name = "phone")
	private WebElement phoneTF;
	
	@FindBy(name = "email")
	private WebElement emailTF;
	
	@FindBy(name = "state")
	private WebElement stateTF;
	
	@FindBy(name = "country")
	private WebElement countryTF;
	
	@FindBy(xpath  = "//input[@class='crmButton small save']")
	private WebElement saveButton;
	
	public CreateNewLeadPage (WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}

	public WebElement getFirstNameTF() {
		return firstNameTF;
	}

	public WebElement getLastNameTF() {
		return lastNameTF;
	}

	public WebElement getCompanyTF() {
		return companyTF;
	}

	public WebElement getTitleTF() {
		return titleTF;
	}

	public WebElement getLeadsourceDropdown() {
		return leadsourceDropdown;
	}

	public WebElement getNoOfEmployeesTF() {
		return noOfEmployeesTF;
	}

	public WebElement getPhoneTF() {
		return phoneTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getStateTF() {
		return stateTF;
	}

	public WebElement getCountryTF() {
		return countryTF;
	}
	
	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void createNewLead(String firstName ,String lastName ,String company) {
		getFirstNameTF().sendKeys(firstName);
		getLastNameTF().sendKeys(lastName);
		getCompanyTF().sendKeys(company);
		getSaveButton().click();
		
	}
	

	public void createNewLead(String lastName, String company, String title, String leadSource, String employees ) {
		getLastNameTF().sendKeys(lastName);
		getCompanyTF().sendKeys(company);
		getTitleTF().sendKeys(title);
		SeleniumUtility sutil = new SeleniumUtility();
		sutil.selectOptionByValue(leadsourceDropdown, leadSource);
		getNoOfEmployeesTF().sendKeys(employees);
		getSaveButton().click();
		
	}
	
	public void createNewLead(String lastName, String company, String employees,String phone, String email, String state, String country) {
		getLastNameTF().sendKeys(lastName);
		getCompanyTF().sendKeys(company);
		getNoOfEmployeesTF().sendKeys(employees);
		getPhoneTF().sendKeys(phone);
		getEmailTF().sendKeys(email);
		getStateTF().sendKeys(state);
		getCountryTF().sendKeys(country);
		getSaveButton().click();
		
	}
}
