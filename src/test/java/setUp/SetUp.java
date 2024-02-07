package setUp;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SetUp {
	public  WebDriver driver;
	 
	
	public WebDriver getDriver(String browser) {
	
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", "./src/test/resources/driver/msedgedriver.exe");
			
			driver = new EdgeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.marionette", "./src/test/resources/driver/geckodriver.exe"); 
			driver = new FirefoxDriver();
			
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
		
	}
	
	
	
}
