package setUp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SetUp {
	public  WebDriver driver;
	 
	public WebDriver getDriver() {
	
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
	
		driver = new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		return driver;
		
	}
	
	
}
