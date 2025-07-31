package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features =".//Features",
		glue = "stepdefinitions",
		dryRun = false,
		monochrome = true,
		tags = "@Sanity",
		plugin = {"pretty","html:target/cucumber-reports/report_html.html","rerun:target/failedscenarios.txt","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)
public class TestRunner {

}
