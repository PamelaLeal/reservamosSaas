package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Register  {

	WebDriver driver; 
	
	public Register(WebDriver driver) {
		this.driver=driver;
	}
	
	public void selectGender(String gender) {
		WebElement genderSelect= driver.findElement(By.id("gender-"+gender));
		genderSelect.click();
		
	}
	
	public void nameSendKeys(String getName) {
		WebElement name= driver.findElement(By.id("FirstName"));
		name.sendKeys(getName);
	}
	public void lastNameSendKeys(String getLastName) {
		WebElement lastName= driver.findElement(By.id("LastName"));
		lastName.sendKeys(getLastName);
	}
	
	public void selectBirthDate(String Birthday,String BirthMonth, String BirthYear) {
		
		WebElement day= driver.findElement(By.name("DateOfBirthDay"));
		WebElement month= driver.findElement(By.name("DateOfBirthMonth"));
		WebElement year= driver.findElement(By.name("DateOfBirthYear"));
		Select objSelect=null;
		try {
			objSelect= new Select(day);
			objSelect.selectByValue(Birthday);
			Thread.sleep(2000);
			
			objSelect= new Select(month);
			objSelect.selectByValue(BirthMonth);
			Thread.sleep(2000);
			
			objSelect= new Select(year);
			objSelect.selectByValue(BirthYear);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void emailSendKeys(String getEmail) {
		WebElement email= driver.findElement(By.id("Email"));
		email.sendKeys(getEmail);
	}
	
	public void companySendKeys(String getCompany) {
		WebElement company= driver.findElement(By.id("Company"));
		company.sendKeys(getCompany);
	}
	public void PasswordSendKeys(String getPassword) {
		WebElement pass= driver.findElement(By.id("Password"));
		pass.sendKeys(getPassword);
	}
	
	public void confirmPasswordSendKeys(String getconfirmPassword) {
		WebElement ConfirmPass= driver.findElement(By.id("ConfirmPassword"));
		ConfirmPass.sendKeys(getconfirmPassword);
	}
	
	public void clickRegister() {
		WebElement registerButton= driver.findElement(By.id("register-button"));
		registerButton.click();
	}
}
