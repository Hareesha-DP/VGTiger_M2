package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

/**
 * This is an utility class which has functionalities from selenium
 */
public class SeleniumUtility {
	
	/**
	 * This is a generic method to access the web application
	 * @param driver
	 * @param url
	 */
	
	public void accessApplication(WebDriver driver ,String url) {
		driver.get(url);
	}
//	-------------------------------------------------------------------------------------------------------------
	
	/**
	 * This is a generic method to access a maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
//	--------------------------------------------------------------------------------------------------------------
	
	/**
	 * This is a generic method to provide implicit wait
	 * @param driver
	 * @param maxTime
	 */
	public void implicitWait(WebDriver driver , int maxTime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
		
	}
	
	/**
	 * This is a generic method used to refresh the current web page.
	 * @param driver
	 */
	public void refreshCurrentPage(WebDriver driver) {
		driver.navigate().refresh();
	}
	
////////////////********************** Handling Mouse Actions ************************************///////////////////

	/**
	 * This is a generic method to perform mouse hovering action on an element
	 * @param driver
	 * @param element
	 */
	public void mouseHoveringAction(WebDriver driver , WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
//------------------------------------------------------------------------------------------------------------------
	/**
	 * This is a generic method used to perform right click action on an element
	 * @param driver
	 * @param element
	 */
	public void rightClickAction(WebDriver driver , WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}
	
//-----------------------------------------------------------------------------------------------------------------
	/**
	 * This is a generic method used to perform double click action on an element
	 * @param driver
	 * @param element
	 */
	public void doubleClickAction(WebDriver driver , WebElement element) {
		Actions act = new Actions (driver);
		act.doubleClick(element).perform();
	}
	
///////*********************** Handling Drop downs ********************//////////////////// 

	/**
	 * This is a generic method used to select an option in a drop down by using index
	 * @param dropdownEle
	 * @param index
	 */
	public void selectOptionByIndex(WebElement dropdownEle, int index) {
		Select sel = new Select (dropdownEle);
		sel.selectByIndex(index);
	}
	
//------------------------------------------------------------------------------------------------------------------
	/**
	 * This is a generic method used to select an option in a drop down by using value
	 * @param dropdownele
	 * @param value
	 */
	public void selectOptionByValue(WebElement dropdownele , String value) {
		Select sel = new Select (dropdownele);
		sel.selectByValue(value);
		
	}
	
//------------------------------------------------------------------------------------------------------------------
	
	/**
	 * This is a generic method used to select an option in a drop down by using visible text
	 * @param dropdownele
	 * @param visibletext
	 */
	public void selectOptionByVisibleText(WebElement dropdownele , String visibletext) {
		Select sel = new Select (dropdownele);
		sel.selectByVisibleText(visibletext);
	}
///////************************** Handling alert pop ups ******************************////////////	
	
	/**
	 * This is a generic method to accept an alert pop up
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
//-------------------------------------------------------------------------------------------------------------------
	/**
	 * This is a generic method to dismiss an alert pop up
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
}
	
//---------------------------------------------------------------------------------------------------------------------

	/**
	 * This is a generic method used to capture a screenshot of web page.
	 * @param driver
	 * @param screenshotName
	 * @return
	 * @throws IOException
	 */
public String captureScreenshot(WebDriver driver , String screenshotName) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File(".\\Screenshots\\"+screenshotName+".png");
	Files.copy(src, dest);
	return dest.getAbsolutePath(); // used in listeners.
	
	}

}