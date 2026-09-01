package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a POM class for Leads webpage
 * @author rajat burnwal
 * @version 26-08-10
 */
public class LeadsPage {

	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement createNewLeadicon;
	
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewLeadicon() {
		return createNewLeadicon;
	}
	
	/**
	 * This is a business library to click on create new lead icon
	 */
	public void clickOnCreateNewLeadIcon() {
		getCreateNewLeadicon().click();
	}
}
