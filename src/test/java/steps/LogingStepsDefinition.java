package steps;


import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LogingPage;
import pages.TestBase;
 
public class LogingStepsDefinition extends TestBase { 
	LogingPage logingpageobj;
	
	@Before
	public void beforeRun() {
	initDriver();
	logingpageobj = PageFactory.initElements(driver, LogingPage.class);// this methods will used when i try to put the password first...
		
	}
	
	@Given ("^User is on  the TechFios loign page$")
	public void user_is_on_the_techfios_loign_page() {
    
    }
	
	@When ("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {
    logingpageobj.insertUsername(username);	
	}
	
	@When ("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
	logingpageobj.insertPassword(password);	
	}
	
	@When ("^user clicks signin button$")
	public void user_clicks_signin_button() {
	logingpageobj.clickSignINButton();	
	}
	
	@Then ("^User should land on the dashbord page$") 
	public void user_should_land_on_the_dashbord_page() throws IOException {
	logingpageobj.varifydashboardpage();
	takeScreenshot(driver);
	}
	
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
}
