package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeValue 
{
  public static void main(String[] args) {
	
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	 // driver.get("https://demowebshop.tricentis.com/");
	  //WebElement value=driver.findElement(By.id("small-searchterms"));
	 // String val= value.getAttribute("id");
	  //System.out.println(val);
	  
	  
	  driver.get("https://www.facebook.com/");
	  WebElement language=driver.findElement(By.xpath("//a[@title='Gujarati']"));
	  String val=language.getAttribute("title");
	  System.out.println(val);
	  
	  
	  
	  
}
}
