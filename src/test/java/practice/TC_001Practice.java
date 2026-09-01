package practice;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_001Practice extends BaseClass {

	@Test
	public void LE_001() throws IOException {
//		ExcelUtility eutil = new ExcelUtility();
//		PropertiesUtility putil = new PropertiesUtility();
//		SeleniumUtility sutil = new SeleniumUtility();
//		WebDriver driver = new ChromeDriver();
//		sutil.maximizeWindow(driver);
//		sutil.implicitWait(driver, 15);
//		String URL = putil.getDataFromProperties("url");
//		String UN = putil.getDataFromProperties("username");
//		String PWD = putil.getDataFromProperties("password");
//		sutil.accessApplication(driver, URL);
//		LoginPage lp = new LoginPage(driver);
//		lp.loginToApplication(UN, PWD);
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lep = new LeadsPage(driver);
		lep.clickOnCreateNewLeadIcon();
		String firstName = eutil.getDataFromExcel("Leads", 1, 1);
		String lastName = eutil.getDataFromExcel("Leads", 1, 2);
		String company = eutil.getDataFromExcel("Leads", 1, 3);
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(firstName, lastName, company);
//		hp.logoutOperation(driver);
//		sutil.closeBrowser(driver);
	}

}
