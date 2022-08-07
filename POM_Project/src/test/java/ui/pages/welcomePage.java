package ui.pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class welcomePage extends ProjectSpecificMethods {
	
	public welcomePage() {
		
	}

	public homePage clickCrmsfa() {
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		return new homePage();
	}
}
