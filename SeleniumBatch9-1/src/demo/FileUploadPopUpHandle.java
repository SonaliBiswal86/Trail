package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUpHandle
{
   public static void main(String[] args)
   {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://the-internet.herokuapp.com/upload");
	  driver.findElement(By.id("file-upload")).sendKeys("C:\selenium1\texting.txt");
	   
	   
   }
}
