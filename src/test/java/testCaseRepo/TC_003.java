package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_003 extends BaseClass {

	@Test(groups = {"Smoke", "Sanity"})
	public void LE_003() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		String lastName = eutil.getDataFromExcel("Leads", 7, 1);
		String comapny = eutil.getDataFromExcel("Leads", 7, 2);
		String mobile = eutil.getDataFromExcel("Leads", 7, 3);
		String email = eutil.getDataFromExcel("Leads", 7, 4);
		String city = eutil.getDataFromExcel("Leads", 7, 5);
		String state = eutil.getDataFromExcel("Leads", 7, 6);
		String country = eutil.getDataFromExcel("Leads", 7, 7);
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(lastName, comapny, mobile, email, city, state, country);		
	}
	
}
