package stepDefinitions;

import org.testng.annotations.Test;

import io.cucumber.java.en.*;

@Test
public class Login {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Given");
	}
	@When("user login with valid username and password")
	public void user_login_with_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("When");
	   
	}
	@When("user login with valid username {string} and password {string}")
	public void user_login_with_valid_username_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("my name is: "+string);
	}
	@Then("Verify Home page is displayed")
	public void verify_home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Then");
	}
}
