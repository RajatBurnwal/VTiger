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
 * This is a utility class which has the functionalities from Selenium library
 * @author rajat burnwal
 * @version 26-08-06
 */
public class SeleniumUtility {

	/**
	 * This is a generic method to access a web application
	 * @param driver
	 * @param URL
	 */
	public void accessApplication(WebDriver driver, String URL) {
		driver.get(URL);
	}
	
	/**
	 * This is a generic method to maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * This is a generic method to refresh the current webpage
	 * @param driver
	 */
	public void refreshWebpage(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	/**
	 * This is a generic method to provide implicit wait
	 * @param driver
	 * @param maxTime
	 */
	public void implicitWait(WebDriver driver, int maxTime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}
	
	/**
	 * This is a generic method to close the browser
	 * @param driver
	 */
	public void closeBrowser(WebDriver driver) {
		driver.quit();
	}
	
	///////********** Handling dropdowns ********////////////
	
	/**
	 * This is a generic method to select an option in a dropdown using index
	 * @param dropdownEle
	 * @param index
	 */
	public void selectOptionByIndex(WebElement dropdownEle, int index) {
		Select s = new Select(dropdownEle);
		s.selectByIndex(index);
	}
	
	/**
	 * This is a generic method to select an option in a dropdown using value attribute
	 * @param dropdownEle
	 * @param value
	 */
	public void selectOptionByValue(WebElement dropdownEle, String value) {
		Select s = new Select(dropdownEle);
		s.selectByValue(value);
	}
	
	/**
	 * This is a generic method to select an option in a dropdown using visible text
	 * @param dropdownEle
	 * @param visibleText
	 */
	public void selectOptionByVisibleText(WebElement dropdownEle, String visibleText) {
		Select s = new Select(dropdownEle);
		s.selectByVisibleText(visibleText);
	}
	
	//////////******** Mouse Actions **********//////////
	
	/**
	 * This is a generic method to perform right click operation on a webelement
	 * @param driver
	 * @param element
	 */
	public void rightClickOperation(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}
	
	/**
	 * This is a generic method to perform double click operation on a webelement
	 * @param driver
	 * @param element
	 */
	public void doubleClickOperation(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	/**
	 * This is a generic method to perform mouse hovering operation on a webelement
	 * @param driver
	 * @param element
	 */
	public void mouseHoveringAction(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	//////////******** Alert popup *******/////////
	
	/**
	 * This is a generic method to accept the alert popup
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This is a generic method to dismiss the alert popup
	 * @param driver
	 */
	public void cancelAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	////////******** Handling Frames ********//////////
	
	/**
	 * This is a generic method to switch the control inside frame using frame index
	 * @param driver
	 * @param frameIndex
	 */
	public void switchToFrameUsingIndex(WebDriver driver, int frameIndex) {
		driver.switchTo().frame(frameIndex);
	}
	
	/**
	 * This is a generic method to switch the control inside frame using frame element
	 * @param driver
	 * @param frameEle
	 */
	public void switchToFrameUsingWebElement(WebDriver driver, WebElement frameEle) {
		driver.switchTo().frame(frameEle);
	}
	
	/////////******** Screenshot ********///////////
	
	/**
	 * This is a generic method to capture webpage screenshot
	 * @param driver
	 * @param filename
	 * @return
	 * @throws IOException
	 */
	public String takeWebpageScreenshot(WebDriver driver, String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshots\\"+filename+".png");
		Files.copy(src, dest);
		return dest.getAbsolutePath(); 			//used for listeners
	}
}
