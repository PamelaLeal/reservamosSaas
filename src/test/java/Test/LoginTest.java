package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import setUp.SetUp;
import Pages.Login;

public class LoginTest extends SetUp{
WebDriver driver= getDriver();
	
	@Test
	public void test() throws InterruptedException {
		Login login= new Login(driver);
		driver.findElement(By.linkText("Log in")).click();
		
		Thread.sleep(2000);
		
		login.email("p111@gmail.com");
		login.Password("globoAzul1");
		Thread.sleep(2000);
		login.clickLogin();
		Thread.sleep(2000);
		
		Boolean logout= driver.getPageSource().contains("Log out");
		Assert.assertTrue(logout);
	}
	

}
