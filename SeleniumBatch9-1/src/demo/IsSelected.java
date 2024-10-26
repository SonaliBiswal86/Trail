package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected
{
  public static void main(String[] args) 
  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
	System.out.println(checkbox.isSelected());
	checkbox.click();
	System.out.println(checkbox.isSelected());
	
	
	
  }
}
