package xpathpractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotSearchText 
{
  public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
   // WebElement text=driver.findElement(By.id("small-searchterm"));
	WebElement text	=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	File img=text.getScreenshotAs(OutputType.FILE);
	File path=new File("./screenshot/Searchtext.png");
	FileHandler.copy(img, path);
	
}
}
