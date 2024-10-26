package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
 public static void main(String[] args) throws InterruptedException 
 { 
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demowebshop.tricentis.com/");
	 driver.findElement(By.cssSelector("[class='ico-login']")).click();
	 driver.findElement(By.cssSelector("[autofocus='autofocus']")).sendKeys("sonali.123@gmail.com");
	 driver.findElement(By.cssSelector("[type='password']")).sendKeys("sona123");
	 driver.findElement(By.cssSelector("[value='Log in']")).click();
	 Thread.sleep(3000);
	 driver.quit();
 }	 
}
	
