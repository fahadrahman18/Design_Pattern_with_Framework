package ui.pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class leadsPage extends ProjectSpecificMethods{
	
	public leadsPage() {
	
	}
	
	public createLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new createLeadPage();
	}

}
