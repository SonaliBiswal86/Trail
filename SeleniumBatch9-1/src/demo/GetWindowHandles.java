package demo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles
{
	public static void main(String[] args) 
	 {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	    Set<String> sessionId=driver.getWindowHandles();
	    System.out.println(sessionId);
	}

}
