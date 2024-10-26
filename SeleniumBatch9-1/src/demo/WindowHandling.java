package demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling
{
  public static void main(String[] args) 
  {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		String mainId = driver.getWindowHandle();
		System.out.println(mainId);
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		for (String id : allIds) {
			if (!(id.equals(dwsId))) {
				driver.switchTo().window(id);
				System.out.println(driver.getCurrentUrl());
			}
		}
	  
  }
}
