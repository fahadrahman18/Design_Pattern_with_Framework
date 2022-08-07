package ui.pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class homePage extends ProjectSpecificMethods {
	
	public homePage() {
		
	}
	
	public leadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click(); 
		return new leadsPage();
	}

}
