package setUp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SetUp {
	public  WebDriver driver;
	 
	public WebDriver getDriver(String browser) {
	
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", "./src/test/resources/driver/msegedriver.exe");
			
			driver = new EdgeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/driver/geckodriver.exe");
			
			driver = new FirefoxDriver();
			
		}
		driver.navigate().to("https://www.saucedemo.com/");
		return driver;
		
	}
	
	
}
