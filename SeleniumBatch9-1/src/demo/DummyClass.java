package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyClass 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getPageSource());
		driver.close();
	}
}
