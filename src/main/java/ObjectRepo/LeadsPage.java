package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	
	@FindBy (xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createNewLeadsIcon;
	
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewLeadsIcon() {
		return createNewLeadsIcon;
	}
	
	
	public void clickOnCreateNewLeadsIcon() {
		getCreateNewLeadsIcon().click();
		
	}
	

}
