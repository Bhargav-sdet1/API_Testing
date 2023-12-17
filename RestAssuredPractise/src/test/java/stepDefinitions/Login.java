package stepDefinitions;

import io.cucumber.java.en.*;

public class Login {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Given");
	    throw new io.cucumber.java.PendingException();
	}
	@When("user login with valid username and password")
	public void user_login_with_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("When");
	    throw new io.cucumber.java.PendingException();
	   
	}
	@Then("Verify Home page is displayed")
	public void verify_home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Then");
	    throw new io.cucumber.java.PendingException();
	}
}
