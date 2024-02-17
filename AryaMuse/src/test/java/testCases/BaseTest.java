package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {

	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver= new ChromeDriver();
		driver.get("https://muse.goarya.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	public String randomString() {
		String randomString=RandomStringUtils.randomAlphabetic(5);
		return randomString;
	}
}
