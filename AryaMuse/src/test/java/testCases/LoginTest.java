package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class LoginTest extends BaseTest{

	@Test
	public void Login() {
		LoginPage lPage= new LoginPage(driver);
		lPage.eneterEmail("nov9@yopmail.com");
		lPage.eneterPassword("Asdfg1@34");
		lPage.clickLogin();
	}
}
