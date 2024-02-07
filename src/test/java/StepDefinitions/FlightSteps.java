package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import setUp.SetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import org.testng.Assert;

import PageFactory.Flight_PF;

public class FlightSteps {

	SetUp driver = new SetUp();
	Flight_PF flightPage = new Flight_PF(driver.getDriver("chrome")); 
	
	@Given("Open the website")
	public void open_the_website() {
		System.out.println("Open the website");
		flightPage.verifyMainPage();
	    
	}

	@When("Select a {string} as a departure location")
	public void select_a_departure_as_a_departure_location(String departure ) throws InterruptedException {
		System.out.println("Select a <departure> location");
		flightPage.departureLocation(departure);
	}

	@And("Select a {string} as a destination location")
	public void select_a_destination_as_a_destination_location(String destination) throws InterruptedException {
		System.out.println("Select a <destination> location");
		flightPage.destinationLocation(destination);
	}

	@And("Choose a travel date")
	public void choose_a_travel_date() throws InterruptedException {
		System.out.println("Choose a travel date");
		flightPage.departureDate("8","Febrero","2024");
	}

	@And("Click on the {string}")
	public void click_on_the(String string) {
		System.out.println("Click on the button");
		flightPage.clickSearch();
	}

	@Then("Choose a trip from the displayed options")
	public void choose_a_trip_from_the_displayed_options() {
		System.out.println("Choose a trip from the displayed options");
		flightPage.chooseTrip();
	}

	@And("Provide {string} as a seat, {string} as a passenger")
	public void provide_as_a_seat_as_a_passenger(String seat, String passenger) throws InterruptedException {
		System.out.println("Proide a seat and passenger");
		flightPage.chooseSeat(seat);
		flightPage.passengerData(passenger);
	}

	@And("Fill payment information and click complete")
	public void fill_payment_information_and_click_complete() throws InterruptedException {
		System.out.println("Fill payment information and click complete");
		flightPage.paymentData();
	}

	@Then("make sure transaction was successful")
	public void make_sure_transaction_was_successful() {
		System.out.println("make sure transaction was successful");
		flightPage.successfulTransaction();
	}

}
