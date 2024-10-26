package dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectEvenIndex
{
  public static void main(String[] args) throws InterruptedException {
	
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoapp.skillrary.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  WebElement dropdown=driver.findElement(By.xpath("//select[@id='cars']"));
	  Select sel=new Select(dropdown);
	  int size=sel.getOptions().size();
	  System.out.println(size);
	  for(int i=1;i<size;i++)
	  {
		  if(i%2==0)
		  {
		  sel.selectByIndex(i);
		  Thread.sleep(1000);
		  }
	  }
	List<WebElement> all=sel.getAllSelectedOptions();
	for(WebElement w:all)
	{
	 System.out.println(w.getText());	
	}
}
	
	
}
