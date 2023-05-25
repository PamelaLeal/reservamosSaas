package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.qameta.allure.Step;


public class AddProduct_PF {

	
	WebDriver driver;
	
	
	public AddProduct_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@Step("userLoggedin")
	public void userLoggedin() {
		Login_PF login= new Login_PF(driver);
		login.validCredentials("standard_user", "secret_sauce");
	}
	@Step("findProduct")
	public boolean findProduct(String product) {
		return driver.getPageSource().contains(product);
	}
	@Step("clickProduct")
	public void clickProduct(String product) {
		driver.findElement(By.linkText(product)).click();;
	}
	@Step("addCart")
	public void addCart() {
		driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
		
	}
	@Step("checkCart")
	public void checkCart(String product) {
		 
		driver.findElement(By.cssSelector(".shopping_cart_link")).click();
		
		driver.getPageSource().contains(product);
	
	}
	

}
