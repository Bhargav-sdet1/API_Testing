package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[text()='Create Account']/parent::button") WebElement CreateAccBtn;
	@FindBy(xpath="//input[@name='fullName']") WebElement fullName;

	public void clickRegister() {
		CreateAccBtn.click();
	}
	
	public void enterFullName(String fName) {
		fullName.sendKeys(fName);
	}

}
