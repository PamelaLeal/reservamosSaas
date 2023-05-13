package Test;


import Pages.Register;
import setUp.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class RegisterTest extends SetUp{
	
	WebDriver driver= getDriver();
	
	@Test
	public void test() throws InterruptedException {
		
		 Register register = new Register(driver);
		
		
		driver.findElement(By.linkText("Register")).click();
		
		Thread.sleep(2000);
		
		register.selectGender("female");
		
		register.nameSendKeys("Pamela");
		register.lastNameSendKeys("Leal");
		register.selectBirthDate("9", "8", "1999");
		register.emailSendKeys("p111@gmail.com");
		register.companySendKeys("FBook");
		register.PasswordSendKeys("globoAzul1");
		register.confirmPasswordSendKeys("globoAzul1");
		register.clickRegister();
		
		Thread.sleep(2000);
		
		Boolean success= driver.getPageSource().contains("Your registration completed");
		
		Assert.assertTrue(success);
		
	}

	

}
