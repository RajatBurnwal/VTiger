package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a POM class for Contacts webpage
 * @author rajat burnwal
 * @version 26-08-10
 */
public class ContactsPage {

	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement createNewContactIcon;
	
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewContactIcon() {
		return createNewContactIcon;
	}
	
	/**
	 * This is a business library to click on create new contact icon
	 */
	public void clickOnCreateNewContactIcon() {
		getCreateNewContactIcon().click();
	}
}
