package testCases;

import org.testng.annotations.Test;

import utilities.DataProviders;

public class LoginDataDrivenTest {

	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void LoginDDT() {
		
	}
}
