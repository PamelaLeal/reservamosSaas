package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;

public class Login_PF {

	@FindBy(id="user-name")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="login-button")
	WebElement btn_login;
	
	
	WebDriver driver;
	
	public Login_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}

	public void clickLogin() {
		btn_login.click();
	
	}

	public void homePage() {
		 driver.getPageSource().contains("Products");
	}

	public void validCredentials(String username, String password) {
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		btn_login.click();
	}
	
	@After
	public void closeDriver() {
		driver.quit();
	}
	
}
