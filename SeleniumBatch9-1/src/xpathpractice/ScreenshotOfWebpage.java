package xpathpractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotOfWebpage
{
 public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File img=ts.getScreenshotAs(OutputType.FILE);
	File path=new File("./screenshot/Alert.png");
	FileHandler.copy(img, path);
	
 }
}
