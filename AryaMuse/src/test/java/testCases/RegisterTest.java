package testCases;

import org.testng.annotations.Test;

import pageObjects.RegisterPage;

public class RegisterTest extends BaseTest{
	@Test
	public void RegisterUser() {
		RegisterPage regPage= new RegisterPage(driver);
		regPage.clickRegister();
		regPage.enterFullName(generateString());
	}
}
