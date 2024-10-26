package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod 
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Options opt=driver.manage();
	Window win=opt.window();
	win.maximize();
	Navigation button=driver.navigate();
	Thread.sleep(3000);
	button.back();
	Thread.sleep(3000);
	button.forward();
	Thread.sleep(3000);
	button.refresh();
	Thread.sleep(3000);
	button.to("https://www.youtube.com/");
  }
}
