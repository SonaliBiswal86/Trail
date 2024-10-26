package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod 
{
  public static void main(String[] args) 
  {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Options opt=driver.manage();
	Window win=opt.window();
	//maximize() returns void
	win.maximize();
	
  }
}

	
	
