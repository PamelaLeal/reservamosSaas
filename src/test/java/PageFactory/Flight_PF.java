package PageFactory;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Flight_PF {


	WebDriver driver;
	
	Main_PF mainPage;
	PassengerPage_PF passengerPage;
	Payment_PF paymentPage;
	 List<WebElement> list;
	 
	
	public Flight_PF(WebDriver driver) {
		this.driver=driver;
		mainPage = new Main_PF(driver);
		passengerPage= new PassengerPage_PF(driver);
		paymentPage= new Payment_PF(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void verifyMainPage() {

	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://berlinas.reservamos-saas.com");
		driver.manage().window().maximize();
		
		String url= driver.getCurrentUrl();
		
		Assert.assertEquals(url, "https://berlinas.reservamos-saas.com/");
		
	}
	
	public void departureLocation(String departure) throws InterruptedException {
		mainPage.setTxt_origin(departure);
		
	}
	
	public void destinationLocation(String destination) throws InterruptedException {
		mainPage.setTxt_destination(destination);
		
	}
	
	public void departureDate(String day,String month,String year) throws InterruptedException {
		mainPage.setTxt_departureDate(day,month,year);;
	
	}
	
	public void returnDate(String day,String month,String year) throws InterruptedException{
		mainPage.setTxt_returnDate(day,month,year);
	
	}
	
	public void clickSearch() {
		mainPage.clickSearch();
	}
	
	public void chooseTrip() {
		list= driver.findElements(By.xpath("//*[contains(text(),'Elige tu silla')]"));
		list.get(0).click();
	}
	
	public void chooseSeat(String seatNumber) throws InterruptedException {
		Thread.sleep(3000);
		WebElement seat=driver.findElement(By.xpath("//button[contains(text(),'"+seatNumber +"')]"));
			
			 if(seat.getAttribute("class") == "seat-selected" && seat.getAttribute("class") == "seat-occupied"){
				
				 System.out.print("Seat isnt able, please choose another one");
					return;
				
			 }
		 
	
		seat.click();
		passengerPage.ClickNextButton();
	}
	
	
	public void passengerData(String name) {
		passengerPage.setTxt_passengerName(name);
		passengerPage.setTxt_passengerLastName("Rosales");
		passengerPage.setTxt_passengerMail("juanrosales@gmail.com");
		passengerPage.setSlc_day("03");
		passengerPage.setSlc_month("03 - Mar");
		passengerPage.setSlc_year("1999");
		passengerPage.setSlc_nationality("Colombia");
		passengerPage.setTxt_documentId("1234567890");
		passengerPage.ClickNextButton();
	}
	
	
	public void paymentData() throws InterruptedException {
		paymentPage.setTxt_purchaserName("APRO");
		paymentPage.setTxt_purchaserLastName("Test");
		paymentPage.setTxt_purchaserPhone("45645645");
		paymentPage.setTxt_purchaserMail("test_user_719388596@testuser.com");
		paymentPage.setSlc_documentType("Cédula de ciudadanía");
		paymentPage.setTxt_documentId("123456789");
		paymentPage.payment("Crédito");
	}
	
	public void successfulTransaction() {
		boolean successfulMessage= driver.getPageSource().contains("exitosa");
		
		Assert.assertEquals(successfulMessage, true);
	}
	
	
	
}
