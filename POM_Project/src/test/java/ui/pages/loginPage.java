package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificMethods;

public class loginPage extends ProjectSpecificMethods{
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	public loginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		return this;

	}
	
	public loginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	
	public welcomePage clickLoginPositive() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new welcomePage(driver);
	}
	
	public loginPage clickLoginNegative() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
	}
}
