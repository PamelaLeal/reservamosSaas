package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/addProducts.feature" , glue= {"StepDefinitions"},
monochrome=true,
plugin= {"json:target/AddProductReport.jason", 
		"pretty","html:target/HtmlReports/AddProductsReport.html"}
		)
public class TestRunner_AddProducts {

}
