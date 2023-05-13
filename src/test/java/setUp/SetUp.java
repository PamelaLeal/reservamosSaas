package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SetUp {
	public  WebDriver driver;
	 
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pamel\\OneDrive\\Escritorio\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://demo.nopcommerce.com/");
		return driver;
		
	}
	
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
}
