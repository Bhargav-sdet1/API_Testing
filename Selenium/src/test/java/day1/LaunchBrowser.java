package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LaunchBrowser {

	WebDriver driver;
	
	@BeforeTest
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://muse.goarya.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void Login() {
		String CurrentTitle="Arya Muse";
		String ExpectedTitle=driver.getTitle();
		Assert.assertEquals(CurrentTitle,ExpectedTitle );
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("nov9@yopmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Asdfg1@34");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
