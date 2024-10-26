package demowebshop;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PurchaseProduct 
{
  public static void main(String[] args) throws InterruptedException 
  {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sonali.123@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("sona123");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[1]/a")).click();
		driver.findElement(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button' ])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		WebElement countryDropDown = driver.findElement(By.xpath("//select[@class='country-input']"));
		Select sel = new Select(countryDropDown);
		sel.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.xpath("(//input[@title='Continue' and @value='Continue'])[1]")).click();
		driver.findElement(By.xpath("//input[@value='Continue' and @onclick='Billing.save()']")).click();
		driver.findElement(By.xpath("(//input[@class='button-1 new-address-next-step-button'])[1]")).click();

		WebElement shippingContinueBut = driver
				.findElement(By.xpath("//select[@onchange='Shipping.newAddress(!this.value)']"));
		Select sel2 = new Select(shippingContinueBut);
		sel2.selectByIndex(1);
		driver.findElement(By.xpath("(//input[@class='button-1 new-address-next-step-button'])[2]")).click();
		driver.findElement(By.cssSelector("[class='button-1 shipping-method-next-step-button']")).click();
		driver.findElement(By.cssSelector("[class='button-1 payment-method-next-step-button']")).click();
		driver.findElement(By.cssSelector("[class='button-1 payment-info-next-step-button']")).click();
		driver.findElement(By.cssSelector("[class='button-1 confirm-order-next-step-button']")).click();
		driver.findElement(By.partialLinkText("Click here for order details.")).click();
		driver.findElement(By.partialLinkText("Log out")).click();

  }
}
