package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MuseLogin {
	WebDriver driver;
	String uEmail="nov9@yopmail.com";
	String uPassword="Asdfg1@34";
	@Test(priority=1)
	public void SetUp() {
		driver=new ChromeDriver();
		driver.get("https://muse.goarya.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=2)
	public void Login() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uEmail);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(uPassword);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(priority=3)
	public void tearDown() {
		WebElement HomeIcon=driver.findElement(By.xpath("//div[@class='header-menu-parent-panel']//li[2]"));
		Assert.assertEquals(true, HomeIcon.isDisplayed());
		driver.quit();
	}
}
