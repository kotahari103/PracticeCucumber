package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="@target/failedscenarios.txt",
		glue = "stepdefinitions",
		dryRun = false,
		monochrome = true,
		tags = "@Smoke",
		plugin = {"pretty","html:target/cucumber-reports/report_html.html",}
		
		)
public class TestRunnerFailed {

}
