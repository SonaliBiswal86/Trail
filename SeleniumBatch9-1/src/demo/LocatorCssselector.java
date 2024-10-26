package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCssselector 
{
	public static void main(String[] args) throws InterruptedException  
	 {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			//driver.findElement(By.cssSelector("[autocomplete='off']")).click();
			//driver.findElement(By.cssSelector("input[autocomplete='off']")).sendKeys("Sonali");
			driver.findElement(By.cssSelector("[class='search-box-text ui-autocomplete-input']")).click();
			Thread.sleep(3000);
			driver.quit();
		
	}
}
