package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition  {
	
	public static Logger log;
	
	@Before
	public void setup() {
		log = LogManager.getLogger("StepDefinition");
		System.out.println("Executed before background");
		log.fatal("Setup1 executed...");
	}
	
	@BeforeStep
	public void beforGherkin() {
		System.out.println("Before every step");
		log.info("before step executed");
	}
	
	@Given("User is on the login page")
	public void user_is_on_the_loginpage() {
		System.out.println("User is on the loginpage");
	}
	
	@And("User validate the login page header")
	public void user_validate_the_login_page_header() {
		System.out.println("User validates the login page header");
	}
	
	@When("User enters username {string} and password {string}")
	public void user_enters_username_and_password(String username,String password) {
		System.out.println(username);
		System.out.println(password);
	}
	
	@Then("User should be redirected to the dashboard")
	public void user_should_be_redirected_to_the_dashboard() {
		System.out.println("user redirected to the dashboard");
	}
	
	@And("User Clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("User clicks on login button");
	}
	
	@When("User enters the username {string} and password {string}")
	public void user_enters_the_username_and_password(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
	
	@Then("User should not redirected to the dashboard")
	public void user_should_not_redirected_to_the_dashboard() {
		System.out.println("User is not redirected to the daashboard");
	}
	
	@When("User updates profile with following details")
	public void user_updates_profile_with_following_details(DataTable dataTable) {
			List<Map<String,String>> profileData =dataTable.asMaps(String.class,String.class);
			Map<String,String> data =profileData.get(0);
			System.out.println(data.get("firstname"));
			System.out.println(data.get("lastname"));
			System.out.println(data.get("email"));
			System.out.println(data.get("phone"));
			
			Map<String,String> data1 =profileData.get(1);
			System.out.println(data1.get("firstname"));
			System.out.println(data1.get("lastname"));
			System.out.println(data1.get("email"));
			System.out.println(data1.get("phone"));
	}
	
	@And("Clicks on submit button")
	public void clicks_on_submit_button() {
		System.out.println("User clicks on the submit button");
		Assert.assertTrue(true);
		log.info("clicks on submit");
	}
	
	@Then("Navigated to the user page")
	public void navigated_to_the_user_page() {
		System.out.println("Navigate to the user page");
	}
	
	@Then("User validates the header")
	public void user_validates_the_header() {
		Assert.assertTrue(false);
	}
	
	@Then("User validates main header")
	public void user_validates_main_header() {
		Assert.assertTrue(true);
		log.info("user validates main header");
	}
	
	@When("User logins and enter {string}")
	public void user_logins_and_enter(String mobilename) {
		System.out.println(mobilename);
	}
	
	@Then("User enters {string}")
	public void user_enters(String phonenumber) {
		System.out.println(phonenumber);
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario) {

		if (scenario.isFailed()) {
			System.out.println("Scenario is failed");
		}
	}
	
	
	@After
	public void tearDown() {
		System.out.println("Executed after all scenarios");
		log.info("tear down method");
	}
}
