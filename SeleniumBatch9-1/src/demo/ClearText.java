package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearText 
{

	 public static void main(String[] args) throws InterruptedException {
			
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demowebshop.tricentis.com/");
		  WebElement text=driver.findElement(By.id("small-searchterms"));
		  text.sendKeys("sonali");
		  Thread.sleep(3000);
		  text.clear();
		  
		  
		  
		  
	}


}
