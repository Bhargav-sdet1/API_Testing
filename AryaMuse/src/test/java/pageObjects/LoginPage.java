package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@type='email']")
	WebElement Email;
	@FindBy(xpath = "//input[@type='password']")
	WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement LoginBtn;

	public void setEmail(String email) {
		Email.sendKeys(email);
	}

	public void setPassword(String password) {
		Password.sendKeys(password);
	}

	public void clickLogin() {
		LoginBtn.click();
	}

}
