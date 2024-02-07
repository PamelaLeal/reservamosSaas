package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import setUp.SetUp;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/flight.feature" , glue= {"StepDefinitions"},
monochrome=true,
plugin= {"json:target/flightReport.jason", 
		"pretty","html:target/HtmlReports/flightReport.html"}
		)
public class TestRunner_Flight{


}
