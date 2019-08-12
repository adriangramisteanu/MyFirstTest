package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		
		driver = new SafariDriver();
		
	}
	
	@Test
	public void doLogin() throws InterruptedException {
		
		driver.get("https://login.yahoo.com");
		driver.findElement(By.id("login-username")).sendKeys("adrian.gramisteanu@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("login-signin")).click();
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
		
	}
	
	
}
