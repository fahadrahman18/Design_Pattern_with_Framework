package ui.pages;

import org.openqa.selenium.WebDriver;

import base.ProjectSpecificMethods;

public class viewLeadPage extends ProjectSpecificMethods{
	
	public viewLeadPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public viewLeadPage verifyLeadId() {
		System.out.println(driver.getTitle());
		return this;
	}

}
