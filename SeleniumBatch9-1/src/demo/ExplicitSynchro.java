package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitSynchro 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/computers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.partialLinkText("Log in")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//to check explicit wait give space in login to get TimeoutExeption
		wait.until(ExpectedConditions.titleContains("Log in"));
		System.out.println(driver.getTitle());
		
		
		
	}
}
