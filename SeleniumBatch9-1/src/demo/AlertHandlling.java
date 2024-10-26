package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlling 
{
 public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
		// driver.findElement(By.xpath("//input[@id='simple']")).click();
		 //driver.findElement(By.xpath("//button[@id='confirm']")).click();
		//driver.findElement(By.xpath("//button[@id='prompt']")).click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		// alt.accept();
		// alt.dismiss();
		//System.out.println(alt.getText());
		alt.sendKeys("sonali");
		alt.accept();

		// driver.close();

}
}
