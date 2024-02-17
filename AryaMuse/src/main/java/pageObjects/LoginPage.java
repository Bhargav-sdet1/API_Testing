package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@type='email']") WebElement Email;
	@FindBy(xpath="//input[@type='password']") WebElement Password;
	@FindBy(xpath="//button[@type='submit']") WebElement loginBtn;
	
	public void eneterEmail(String uEmail) {
		Email.sendKeys(uEmail);
	}
	public void eneterPassword(String uPwd) {
		Password.sendKeys(uPwd);
	}
	public void clickLogin() {
		loginBtn.click();;
	}
	

	
}
