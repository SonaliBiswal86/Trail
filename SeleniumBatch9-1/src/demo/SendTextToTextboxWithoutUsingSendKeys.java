package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendTextToTextboxWithoutUsingSendKeys 
{
	 public static void main(String[] args) throws InterruptedException 
	  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement textbox=driver.findElement(By.id("small-searchterms"));
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='selenium';",textbox);
		
	  }
}