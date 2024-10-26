package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClassname
{
	public static void main(String[] args) throws InterruptedException  
	 {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			//className() locator is not working because space is there in the text
			//WebElement textBox=driver.findElement(By.className("search-box-text ui-autocomplete-input"));
			//textBox.sendKeys("Sonali");
			WebElement register=driver.findElement(By.className("ico-register"));
			register.click();
			Thread.sleep(3000);
			driver.quit();
	}
}
