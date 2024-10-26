package demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingNew 
{
  public static void main(String[] args)
  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//a[text()='Facebook']")).click();
	driver.findElement(By.xpath("//a[text()='Twitter']")).click();
	driver.findElement(By.xpath("//a[text()='YouTube']")).click();
	String mainId=driver.getWindowHandle();
    Set<String> allIds=driver.getWindowHandles();
    for(String id:allIds)
    {
    	if(!(id.equals(mainId)))
    	{
    		driver.switchTo().window(id);
    		//System.out.println(driver.getCurrentUrl());
    	    String title=driver.getTitle();//we can take title also for comparing
    	    if(title.contains("YouTube"))
    	    {
    	    	System.out.println(title);
    	    }
    	}
    	
    	
    }
  }
	
}
