package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame 
{
	 public static void main(String[] args) throws InterruptedException
	   {
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://letcode.in/frame");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   WebElement frame=driver.findElement(By.id("firstFr")); 
		   driver.switchTo().frame(frame);
		   driver.findElement(By.xpath("//input[@placeholder='Enter name']")).sendKeys("sonali");
		   WebElement innerFrame= driver.findElement(By.xpath("//iframe[@class='has-background-white']"));
		   driver.switchTo().frame(innerFrame);
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sona123@gmail.com");
		   driver.switchTo().parentFrame();
		   Thread.sleep(3000); 
		   driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("biswal");
		   
	   }
}
