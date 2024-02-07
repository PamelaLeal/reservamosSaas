package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class Main_PF {

WebDriver driver;
	
	@FindBy(css="input.origin")
	WebElement txt_origin;
	

	@FindBy(css="input.destination")
	WebElement txt_destination;
	
	
	@FindBy(css=".departureDate-wrapper")
	WebElement txt_departureDate;
	
	@FindBy(css=".returnDate-wrapper")
	WebElement txt_returnDate;
	
	@FindBy(css=".search-button")
	WebElement btn_search;
	
	public Main_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getTxt_origin() {
		return txt_origin;
	}

	public void setTxt_origin(String txt_origin) throws InterruptedException {
		
		this.txt_origin.sendKeys(txt_origin);
		this.txt_origin.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'"+txt_origin+"')]")).click();
	}

	public WebElement getTxt_destination() {
		return txt_destination;
	}

	public void setTxt_destination(String txt_destination) throws InterruptedException {
		this.txt_destination.sendKeys(txt_destination);
		this.txt_destination.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'"+txt_destination+"')]")).click();
	}

	public WebElement getTxt_departureDate() {
		return txt_departureDate;
	}

	public void setTxt_departureDate(String day,String month, String year) throws InterruptedException {
		if(month.equals("February") && Integer.parseInt(day)>29) {
			System.out.print("Wrong date" + month + " : "+ day);
			return;
		}
		if(Integer.parseInt(day)>31) {
			System.out.print("Wrong date" + month + " : "+ day);
			return;
		}
		driver.findElement(By.className("departureDate-wrapper")).click();
		String monthTable = driver.findElement(By.className("picker__month")).getText();
		String YearTable = driver.findElement(By.className("picker__year")).getText();
		
		while(!monthTable.equals(month) && YearTable.equals(year)) {
			driver.findElement(By.className("picker__nav--next")).click();
			monthTable = driver.findElement(By.className("picker__month")).getText();
			YearTable = driver.findElement(By.className("picker__year")).getText();
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'"+day+"')]")).click();
		
	}

	public WebElement getTxt_returnDate() {
		return txt_returnDate;
	}

	public void setTxt_returnDate(String day,String month, String year) throws InterruptedException{
		if(month.equals("February") && Integer.parseInt(day)>29) {
			System.out.print("Wrong date" + month + " : "+ day);
			return;
		}
		if(Integer.parseInt(day)>31) {
			System.out.print("Wrong date" + month + " : "+ day);
			return;
		}
		driver.findElement(By.className("departureDate-wrapper")).click();
		String monthTable = driver.findElement(By.className("picker__month")).getText();
		String YearTable = driver.findElement(By.className("picker__year")).getText();
		
		while(!monthTable.equals(month) && YearTable.equals(year)) {
			driver.findElement(By.className("picker__nav--next")).click();
			monthTable = driver.findElement(By.className("picker__month")).getText();
			YearTable = driver.findElement(By.className("picker__year")).getText();
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'"+day+"')]")).click();
	}

	public void clickSearch() {
		btn_search.click();
	}
}
