package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	
	public void email(String getEmail) {
		WebElement email= driver.findElement(By.id("Email"));
		email.sendKeys(getEmail);
	}
	
	public void Password(String getPassword) {
		WebElement pass= driver.findElement(By.id("Password"));
		pass.sendKeys(getPassword);
	}
	
	public void clickLogin() {
		WebElement loginButton= driver.findElement(By.className("button-1 login-button"));
		loginButton.click();
	}

}
