package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificMethods;

public class createLeadPage extends ProjectSpecificMethods{
	
	public createLeadPage(WebDriver driver) {
		this.driver = driver;
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
		return new viewLeadPage(driver);
	}

}
