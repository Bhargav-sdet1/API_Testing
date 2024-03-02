package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class LoginTest extends BaseTest{

	@Test(groups={"Sanity"})
	public void Login() {
		LoginPage lPage= new LoginPage(driver);
		lPage.eneterEmail(prop.getProperty("UserEmail"));
		lPage.eneterPassword(prop.getProperty("UserPassword"));
		lPage.clickLogin();
		boolean isdis=lPage.homeicon();
		Assert.assertEquals(isdis, true);
	}
}
