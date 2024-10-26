package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate
{
	public static void main(String[] args) throws InterruptedException 
	 {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Log in")).click();
			Navigation navi = driver.navigate();
			Thread.sleep(2000);
			navi.back();
			Thread.sleep(2000);
			navi.forward();
			Thread.sleep(2000);
			navi.refresh();
			Thread.sleep(2000);
			navi.to("http://selenium08.blogspot.com/");
			Thread.sleep(2000);
			driver.quit();
	}
}
