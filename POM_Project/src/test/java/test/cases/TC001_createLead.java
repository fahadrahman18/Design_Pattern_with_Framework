package test.cases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import ui.pages.loginPage;

public class TC001_createLead extends ProjectSpecificMethods{
	
	@Test
	public void runTC001() {
		
		loginPage page = new loginPage();
		page
		.enterUsername()
		.enterPassword()
		.clickLoginPositive()
		.clickCrmsfa()
		.clickLeads()
		.clickCreateLead()
		.enterFirstName()
		.enterLastName()
		.enterCompanyName()
		.clickCreateLeadButton()
		.verifyLeadId();

	}
}
