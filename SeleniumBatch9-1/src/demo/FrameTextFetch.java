package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTextFetch 
{
	 public static void main(String[] args) throws InterruptedException
	   {
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://letcode.in/frame");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   WebElement frame=driver.findElement(By.id("firstFr")); 
		   driver.switchTo().frame(frame);
		   driver.findElement(By.name("fname")).sendKeys("sonali");
		   WebElement innerFrame=driver.findElement(By.xpath("//iframe[@class='has-background-white']"));
		   driver.switchTo().frame(innerFrame);
		   driver.findElement(By.name("email")).sendKeys("sona123@gmail.com");
		   driver.switchTo().parentFrame();
		   driver.findElement(By.name("lname")).sendKeys("biswal");
		  
		   driver.switchTo().frame(innerFrame);
		   System.out.println(innerFrame.getText());
	   }
}
