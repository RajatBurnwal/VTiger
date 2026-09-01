package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a POM class for Login webpage
 * @author rajat burnwal
 * @version 26-08-15
 */
public class LoginPage {

	@FindBy(name = "user_name")
	private WebElement usernameTextfield;
	
	@FindBy(name = "user_password")
	private WebElement passwordTextfield;
	
	@FindBy(id = "submitButton")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	/**
	 * This is a business library to perform login to application
	 * @param username
	 * @param password
	 */
	public void loginToApplication(String username, String password) {
		getUsernameTextfield().sendKeys(username);
		getPasswordTextfield().sendKeys(password);
		getLoginButton().click();
	}
}
