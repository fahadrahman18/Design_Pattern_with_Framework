package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificMethods;

public class welcomePage extends ProjectSpecificMethods {
	
	public welcomePage(WebDriver driver) {
		this.driver = driver;
	}

	public homePage clickCrmsfa() {
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		return new homePage(driver);
	}
}
