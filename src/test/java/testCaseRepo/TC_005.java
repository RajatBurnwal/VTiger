package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_005 extends BaseClass {

	@Test(groups = {"Regression"})
	public void CON_002() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreateNewContactIcon();
		String lastName = eutil.getDataFromExcel("Contacts", 4, 1);
		String dept = eutil.getDataFromExcel("Contacts", 4, 2);
		String email = eutil.getDataFromExcel("Contacts", 4, 3);
		String mobile = eutil.getDataFromExcel("Contacts", 4, 4);
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.createNewContact(lastName, dept, email, mobile);
	}
}
