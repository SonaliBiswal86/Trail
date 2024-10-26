package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod 
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement search=driver.findElement(By.id("small-searchterms"));
	Thread.sleep(3000);
	search.sendKeys("sonali");
  }
}
