package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandling
{
  public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://demowebshop.tricentis.com/");
		driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");// take this url for double click action
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// WebElement electrinics =
		// driver.findElement(By.xpath("//ul[@class='top-menu']/li[3]/a"));
		// Actions act = new Actions(driver);
		// act.moveToElement(electrinics).perform();//cursor move to the web element
		// cursor click on web element by click(WebElement)
		// act.click(electrinics).perform();
		// cursor move to webelement and click it by click()
		// act.moveToElement(electrinics).click().perform();

		// perform right click on web element by contextClick() and
		// contextClick(WebElement)
		// act.contextClick(electrinics).perform();
		// act.moveToElement(electrinics).contextClick().perform();
		// perform the double click action
		//WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click me to see Alert message']"));
		Actions act1 = new Actions(driver);
		// act1.doubleClick(doubleClick).perform();
		//act1.moveToElement(doubleClick).doubleClick().perform(); 
		//create a web element for demo dropdown and perform scroll operation to it
		WebElement element=driver.findElement(By.xpath("//a[text()='Demo Dropdown List']"));
		act1.scrollToElement(element).perform();
		
		
}
}
