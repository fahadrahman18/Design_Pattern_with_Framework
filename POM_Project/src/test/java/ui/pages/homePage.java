package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificMethods;

public class homePage extends ProjectSpecificMethods {
	
	public homePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public leadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click(); 
		return new leadsPage(driver);
	}

}
