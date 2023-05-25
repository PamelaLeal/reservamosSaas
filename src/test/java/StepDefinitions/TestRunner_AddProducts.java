package StepDefinitions;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/addProducts.feature" , glue= {"StepDefinitions"},
monochrome=true,
plugin= {"json:target/AddProductReport.jason", 
		"pretty","html:target/HtmlReports/AddProductsReport.html",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
		)
public class TestRunner_AddProducts {

}
