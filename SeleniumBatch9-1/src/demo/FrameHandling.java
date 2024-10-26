package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling 
{
   public static void main(String[] args)
   {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://letcode.in/frame");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   //switch the driver focus to frame by giving index,index will always starts with 0
	   //driver.switchTo().frame(0);
	   //swich the driver focus to frame by giving id/name attribute value
	   //driver.switchTo().frame("firstFr");
	   //swich the driver by giving reference of webElement
	   WebElement frame=driver.findElement(By.id("firstFr")); 
	   driver.switchTo().frame(frame);
	   driver.findElement(By.xpath("//input[@placeholder='Enter name']")).sendKeys("sonali");
	   //change the driver focus from frame to main page
	   driver.switchTo().defaultContent();
	  driver.findElement(By.xpath("//a[@id='testing']")).click();
	   
	   
   }
}
