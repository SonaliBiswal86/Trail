package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register
{
 
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("[class='ico-register']")).click();
		driver.findElement(By.cssSelector("[value='F']")).click();
		driver.findElement(By.cssSelector("[id='FirstName']")).sendKeys("Sonali");
		driver.findElement(By.cssSelector("#LastName")).sendKeys("Biswal");
		driver.findElement(By.cssSelector("[name='Email']")).sendKeys("sonali.123@gmail.com");
		driver.findElement(By.cssSelector("[data-val-length='The password should have at least 6 characters.']")).sendKeys("sona123");
		driver.findElement(By.cssSelector("[id='ConfirmPassword']")).sendKeys("sona123");
		driver.findElement(By.cssSelector("[class='button-1 register-next-step-button']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
}
