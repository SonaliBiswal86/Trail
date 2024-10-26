package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage
{
	public static void main(String[] args) 
	 {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();//new method to maximize window

			
			// Options opts = driver.manage();
			// Window win = opts.window();
			// win.maximize();//3 lines are traditional method
			 
			driver.get("https://demowebshop.tricentis.com/");

	}
}
