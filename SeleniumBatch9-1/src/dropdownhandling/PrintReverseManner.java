package dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintReverseManner {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement listBox=driver.findElement(By.id("cars"));
		Select sel=new Select(listBox);
		int size=sel.getOptions().size();
		for(int i=size;i>0;i--)
		{
			List<WebElement> all=sel.getOptions();
			for(WebElement w:all)
			{
				System.out.println(w.getText());
				
			}
			
			
		}
		
	}

}
