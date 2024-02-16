package day1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Basic {
	WebDriver driver;
	public void takeScreenShot(WebDriver driver) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\bharg\\ForInterviews\\Selenium\\Screenshot\\ss.jpg");
		Files.copy(src,trg);
	}
}
