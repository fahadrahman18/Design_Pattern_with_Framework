package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificMethods;

public class leadsPage extends ProjectSpecificMethods{
	
	public leadsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public createLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new createLeadPage(driver);
	}

}
