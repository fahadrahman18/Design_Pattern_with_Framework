package ui.pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class createLeadPage extends ProjectSpecificMethods{
	
	public createLeadPage() {
		
	}
	
	public createLeadPage enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("fname");
		return this;
	}
	
	public createLeadPage enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lname");
		return this;
	}
	
	public createLeadPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("comname");
		return this;
	}
	
	public viewLeadPage clickCreateLeadButton() {
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		return new viewLeadPage();
	}

}
