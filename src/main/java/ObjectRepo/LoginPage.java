package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Locating the web element
	
	@FindBy(name = "user_name")
	private WebElement userNameTF;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement passwordTF;
	
	@FindBy (id = "submitButton")
	private WebElement loginButton;
	
	//initializing web element
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//public getters
	public WebElement getUserNameTF() {
		return userNameTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	/**
	 * THis is a business library to perform login operation to application
	 * @param username
	 * @param password
	 */
	public void loginToApplication(String username , String password) {
		getUserNameTF().sendKeys(username);
		getPasswordTF().sendKeys(password);
		getLoginButton().click();
	}
	
	
}
