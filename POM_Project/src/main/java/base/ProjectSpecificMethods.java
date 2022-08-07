package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

// GH Token - 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
public class ProjectSpecificMethods {
	public WebDriver driver;
	
	@BeforeMethod
	public void preCondition() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	}
	
	@AfterMethod
	public void postCondition() {
		driver.quit();
	}
	
}
