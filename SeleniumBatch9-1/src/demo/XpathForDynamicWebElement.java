package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForDynamicWebElement
{
	public static void main(String[] args)
	 {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demowebshop.tricentis.com/");
	 System.out.println(driver.findElement(By.xpath("//a[text()='$25 Virtual Gift Card']/../../div[3]/div/span")).getText());
	 System.out.println(driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../../div[3]/div/span")).getText());
	 System.out.println(driver.findElement(By.xpath("//a[text()='Build your own cheap computer']/../../div[3]/div/span")).getText());
	 System.out.println(driver.findElement(By.xpath("//a[text()='Build your own computer']/../../div[3]/div/span")).getText());
	 System.out.println(driver.findElement(By.xpath("//a[text()='Build your own expensive computer']/../../div[3]/div/span")).getText());
	 String price =driver.findElement(By.xpath("//a[text()='Simple Computer']/../../div[3]/div/span")).getText() ;
	 System.out.println(price);
	 
	}
}
