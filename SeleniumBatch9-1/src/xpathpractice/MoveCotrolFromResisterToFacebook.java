package xpathpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveCotrolFromResisterToFacebook
{
 public static void main(String[] args) 
 {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	//driver.findElement(By.xpath("//a[text()='Register']/ancestor::div[4]/following-sibling::div/div/div[4]/ul/li/a")).click();
	//System.out.println(driver.findElement(By.xpath("//a[text()='Register']/ancestor::div[4]/following-sibling::div/div/div[4]/ul/li/a")).getText());
	//driver.findElement(By.xpath("//a[@target='_blank' and text()='Facebook']/../../../../../preceding-sibling::div/div[1]/div[2]/div/ul/li[1]/a")).click();
	System.out.println(driver.findElement(By.xpath("//a[@target='_blank' and text()='Facebook']/../../../../../preceding-sibling::div/div[1]/div[2]/div/ul/li[1]/a")).getText());
	
	
 }
}
