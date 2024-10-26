package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle 
{
	public static void main(String[] args) 
	 {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	    String sessionId=driver.getWindowHandle();
	    System.out.println(sessionId);//2A77AEBDEC15D3C2805ADE339002496C
	}


}
