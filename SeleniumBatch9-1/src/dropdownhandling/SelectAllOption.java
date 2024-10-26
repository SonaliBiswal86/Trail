package dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOption {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement listBox=driver.findElement(By.id("cars"));
	    Select sel=new Select(listBox);	
	    int size= sel.getOptions().size();
	    
	     for(int i=0;i<size;i++)
	    {
	    	sel.selectByIndex(i);
	    }
	     Thread.sleep(2000);
	     int j=size;
	     while(j>0)
	     {
	    	j--;
	    	sel.deselectByIndex(j);
	    	
	    	
	     }
	    
	}
	
}
