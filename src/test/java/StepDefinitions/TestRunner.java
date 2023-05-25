package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/login.feature" , glue= {"StepDefinitions"},
monochrome=true,
plugin= {"json:target/LoginReport.jason", 
		"pretty","html:target/HtmlReports/LoginReport.html"}
		)
public class TestRunner {

}
