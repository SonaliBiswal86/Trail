package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod 
{
   public static void main(String[] args) 
   {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	String pageSourceCode=driver.getPageSource();
	System.out.println(pageSourceCode);
   }
}
