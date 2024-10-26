package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling
{
  public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// code to select a single dropdown
		// WebElement countryDropdown =driver.findElement(By.name("country"));
		// Select sel=new Select(countryDropdown);
		// Thread.sleep(3000);
		// System.out.println(sel.isMultiple());

		WebElement monthDropdown = driver.findElement(By.name("Month"));
		Select sel = new Select(monthDropdown);
		Thread.sleep(3000);
		// System.out.println(sel.isMultiple());
		sel.selectByIndex(5);
		sel.selectByValue("Aug");
		sel.selectByVisibleText("November");
		Thread.sleep(3000);
		sel.deselectByIndex(8);
		sel.deselectByValue("May");
		sel.deselectByVisibleText("November");
		// sel.deselectAll();
		// select all selected options one by one
		/*
		 * List<WebElement> allSelectedOptions=sel.getAllSelectedOptions();
		 * for(WebElement opt:allSelectedOptions) { System.out.println(opt.getText()); }
		 */
		// List<WebElement> allOptions=sel.getOptions();
		// for(WebElement opt:allOptions)
		// {
		// System.out.println(opt.getText());
		// }

	}
}
