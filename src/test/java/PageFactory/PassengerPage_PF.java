package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PassengerPage_PF {

	WebDriver driver;
	
	 
	@FindBy(id="passengers[0].firstName")
	WebElement txt_passengerName;

	@FindBy(id="passengers[0].lastName")
	WebElement txt_passengerLastName;
	
	@FindBy(id="passengers[0].email")
	WebElement txt_passengerMail;
	
	@FindBy(id="passengers[0].documentId")
	WebElement txt_documentId;
	
	@FindBy(id="day-select")
	WebElement slc_day;

	@FindBy(id="month-select")
	WebElement slc_month;
	
	@FindBy(id="year-select")
	WebElement slc_year;
	
	@FindBy(name="passengers[0].nationality")
	WebElement slc_nationality;
	
	@FindBy(name="passengers[0].documentType")
	WebElement slc_documentType;
	
	Select objSelect;
	JavascriptExecutor js;
	
	public PassengerPage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getTxt_passengerName() {
		return txt_passengerName;
	}

	public void setTxt_passengerName(String txt_passengerName) {
		this.txt_passengerName.sendKeys(txt_passengerName);
	}

	public WebElement getTxt_passengerLastName() {
		return txt_passengerLastName;
	}

	public void setTxt_passengerLastName(String txt_passengerLastName) {
		this.txt_passengerLastName.sendKeys(txt_passengerLastName);
	}

	public WebElement getTxt_passengerMail() {
		return txt_passengerMail;
	}

	public void setTxt_passengerMail(String txt_passengerMail) {
		this.txt_passengerMail.sendKeys(txt_passengerMail);
	}

	public WebElement getTxt_documentId() {
		return txt_documentId;
	}

	public void setTxt_documentId(String txt_documentId) {
		this.txt_documentId.sendKeys(txt_documentId);
	}
	
	public void ClickNextButton() {
		js = (JavascriptExecutor) driver;
		WebElement mainButton= driver.findElement(By.cssSelector(".css-10fhysf-D"));
		js.executeScript("arguments[0].scrollIntoView();", mainButton);
		mainButton.click();
	}
	
	public void setSlc_day(String day) {
		objSelect= new Select(slc_day);
		objSelect.selectByVisibleText(day);
	}

	public void setSlc_month(String month) {
		objSelect= new Select(slc_month);
		objSelect.selectByVisibleText(month);
	}

	public void setSlc_year(String year) {
		objSelect= new Select(slc_year);
		objSelect.selectByVisibleText(year);
	}

	public void setSlc_nationality(String nationality) {
		objSelect= new Select(slc_nationality);
		objSelect.selectByVisibleText(nationality);
	}

	public void setSlc_documentType(String documentType) {
		objSelect= new Select(slc_documentType);
		objSelect.selectByVisibleText(documentType);
	}
	
	
}
