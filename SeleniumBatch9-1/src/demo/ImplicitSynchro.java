package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitSynchro
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//give wrong xpath to get NoSuchElementExeption
		driver.findElement(By.xpath("button[@id='prompt']")).click();
		
		
	}
}
