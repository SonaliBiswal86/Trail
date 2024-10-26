package demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotForLogin 
{
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Log in']"));
		File img = loginBtn.getScreenshotAs(OutputType.FILE);
		File path = new File("./screenshot/Login.png");
		FileHandler.copy(img, path);

	}
}
