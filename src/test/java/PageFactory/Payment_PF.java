package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Payment_PF {

	WebDriver driver;
	
	@FindBy(id="purchaserFirstName")
	WebElement txt_purchaserName;

	@FindBy(id="purchaserLastName")
	WebElement txt_purchaserLastName;
	
	@FindBy(id="email")
	WebElement txt_purchaserMail;
	
	@FindBy(id="phone")
	WebElement txt_purchaserPhone;
	
	@FindBy(name="documentType")
	WebElement slc_documentType;
	
	@FindBy(id="documentId")
	WebElement txt_documentId;
	
	Select objSelect;
	JavascriptExecutor js;
	
	public Payment_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void setTxt_purchaserName(String purchaserName) {
		txt_purchaserName.sendKeys(purchaserName);
	}

	public void setTxt_purchaserLastName(String purchaserLastName) {
		txt_purchaserLastName.sendKeys(purchaserLastName);
	}

	public void setTxt_purchaserMail(String purchaserMail) {
		txt_purchaserMail.sendKeys(purchaserMail);
	}

	public void setTxt_purchaserPhone(String purchaserPhone) {
		txt_purchaserPhone.sendKeys(purchaserPhone);
	}

	public void setTxt_documentId(String documentId) {
		txt_documentId.sendKeys(documentId);
	}
	
	public void setSlc_documentType(String documentType) {
		objSelect= new Select(slc_documentType);
		objSelect.selectByVisibleText(documentType);
	}
	
	public void payment(String typePayment) throws InterruptedException{
		js = (JavascriptExecutor) driver;
		
		if(typePayment.equalsIgnoreCase("Crédito")) {
			WebElement cardButton= driver.findElement(By.xpath("//*[contains(text(),'Selecciona tu forma de pago')]"));
			js.executeScript("arguments[0].scrollIntoView();", cardButton);
			
			driver.findElement(By.cssSelector("div.payment-selector-badge:nth-child(1) > button:nth-child(1)")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='cardNumber']")).sendKeys("5474 9254 3267 0366");
			driver.findElement(By.xpath("//*[@id='expirationDate']")).sendKeys("11/25");
			driver.findElement(By.xpath("//*[@id='securityCode']")).sendKeys("123");
			
		}
		
	}
	
	public void ClickFinalButton() {
		
		driver.findElement(By.cssSelector(".css-10fhysf-D")).click();
	}
}
