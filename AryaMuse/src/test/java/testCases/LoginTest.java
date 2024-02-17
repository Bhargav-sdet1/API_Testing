package testCases;

import org.testng.annotations.*;
import pageObjects.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void login() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.setEmail("nov9@yopmail.com");
		loginpage.setPassword("Asdfg1@34");;
		loginpage.clickLogin();
	}
	
}
