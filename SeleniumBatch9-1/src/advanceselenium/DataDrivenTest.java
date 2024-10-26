package advanceselenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTest 
{
  public static void main(String[] args) throws Throwable
  {
		// Give the path
		FileInputStream fis = new FileInputStream("./Data/demo.properties");
		// create object for properties
		Properties pObj = new Properties();
		// Load the Input Stream
		pObj.load(fis);
		// Get the Data
		String urlData = pObj.getProperty("url");
		String unData = pObj.getProperty("username");
		String pawData = pObj.getProperty("password");
		System.out.println(urlData);
		System.out.println(unData);
		System.out.println(pawData);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(urlData);
		driver.findElement(By.cssSelector("[class='ico-login']")).click();
		driver.findElement(By.cssSelector("[autofocus='autofocus']")).sendKeys(unData);
		driver.findElement(By.cssSelector("[type='password']")).sendKeys(pawData);
		driver.findElement(By.cssSelector("[value='Log in']")).click();
	
  }
}
