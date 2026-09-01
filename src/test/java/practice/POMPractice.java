package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;

public class POMPractice {

	@FindBy(name = "user_name")
	WebElement nameTF;
	
	public POMPractice(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {

		SeleniumUtility sutil = new SeleniumUtility();
		PropertiesUtility putil = new PropertiesUtility();
		WebDriver driver = new ChromeDriver();
		sutil.maximizeWindow(driver);
		sutil.implicitWait(driver, 15);
		String URL = putil.getDataFromProperties("url");
		String UN = putil.getDataFromProperties("username");
		sutil.accessApplication(driver, URL);
//		WebElement nameTF = driver.findElement(By.name("user_name"));
		POMPractice p = new POMPractice(driver);
		p.nameTF.sendKeys(UN);
//		driver.findElement(By.name("user_name")).sendKeys(UN);
		Thread.sleep(2000);
		sutil.refreshWebpage(driver);
		Thread.sleep(2000);
		p.nameTF.sendKeys(UN);
//		nameTF.sendKeys("robin");
//		driver.findElement(By.name("user_name")).sendKeys(UN);
		
	}

}
