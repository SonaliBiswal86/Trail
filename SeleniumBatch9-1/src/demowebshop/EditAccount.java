package demowebshop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditAccount
{
 public static void main(String[] args) 
 {
	
	 WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demowebshop.tricentis.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.findElement(By.xpath("//a[text()='Log in']")).click();
	  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sonali.123@gmail.com");
	  driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("sona123");
	  driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
	  driver.findElement(By.xpath("//a[text()='My account']")).click();
	  driver.findElement(By.xpath("//a[text()='Addresses' and @class='inactive']")).click();
	  driver.findElement(By.xpath("(//input[@class='button-2 edit-address-button'])[1]")).click();
	  driver.findElement(By.id("Address_Address2")).clear();
	  driver.findElement(By.cssSelector("[class='button-1 save-address-button']")).click();
	  driver.findElement(By.cssSelector("[class='button-1 add-address-button']")).click();
	  driver.findElement(By.id("Address_FirstName")).sendKeys("Abhijit");
	  driver.findElement(By.id("Address_LastName")).sendKeys("Biswal");
	  driver.findElement(By.id("Address_Email")).sendKeys("abhijit123@gmail.com");
	  WebElement countryDropdown=driver.findElement(By.id("Address_CountryId"));
	  Select sel=new Select(countryDropdown);
	  sel.selectByVisibleText("India");
	  driver.findElement(By.id("Address_City")).sendKeys("Hyderabad");
	  driver.findElement(By.id("Address_Address1")).sendKeys("Ameenpur,Outer Ring Road");
	  driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("502031");
	  driver.findElement(By.id("Address_PhoneNumber")).sendKeys("7377491164");
	  driver.findElement(By.cssSelector("[class='button-1 save-address-button']")).click();
	  driver.findElement(By.cssSelector("[class='ico-logout']")).click();
 }
}
