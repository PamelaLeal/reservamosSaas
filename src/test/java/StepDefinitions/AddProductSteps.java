package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageFactory.AddProduct_PF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import setUp.SetUp;

public class AddProductSteps{

	WebDriver driver;
	AddProduct_PF addProduct;
	SetUp setUp = new SetUp();
	
	@Given("user is logged in")
	public void user_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		addProduct= new AddProduct_PF(setUp.getDriver());
		addProduct.userLoggedin();
	}
	

	@When("find (.*)$")
	public void find_product(String product) {
	    // Write code here that turns the phrase above into concrete actions
		
		Assert.assertEquals(addProduct.findProduct(product), true);
	}


	@Then("user clicks on the (.*)$")
	public void user_clicks_on_the_product(String product) {
	    // Write code here that turns the phrase above into concrete actions
		addProduct.clickProduct(product);
	}

	
	@And("click add to cart")
	public void click_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
		addProduct.addCart();
	}
	
	
	@Then("check the cart has (.*)$")
	public void check_the_cart_has_product(String product) {
	    // Write code here that turns the phrase above into concrete actions
		addProduct.checkCart(product);
	}
}
