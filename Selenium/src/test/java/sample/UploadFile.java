package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.manage().window().maximize();
		WebElement file=driver.findElement(By.xpath("//input[@type='file']"));
		file.sendKeys("C:\\Users\\bharg\\ForInterviews\\Selenium\\testData\\1. Selenium-written notes.pdf");
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
