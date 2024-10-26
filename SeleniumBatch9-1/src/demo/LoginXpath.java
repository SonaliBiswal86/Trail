package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginXpath
{
	 public static void main(String[] args) 
	  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("html/body/div[4]/div/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/input")).sendKeys("sonali.123@gmail.com");
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[3]/input")).sendKeys("sona123");
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[5]/input")).click();
	  }
}
