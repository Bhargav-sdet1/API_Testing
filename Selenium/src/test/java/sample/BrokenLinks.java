package sample;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		
		List<WebElement> elements=driver.findElements(By.tagName("a"));
		System.out.println("Total Links: "+elements.size());
		List finalList= new ArrayList();
		for(WebElement ele:elements) {
			if(ele.getAttribute("href")!=null) {
				finalList.add(ele);
			}
		}
		System.out.println("Working links: "+finalList.size());
		System.out.println("Broken Links: "+(elements.size()-finalList.size()));
		driver.quit();
	}	
}
