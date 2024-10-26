package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass
{
   @Test
   public void demoTest()
   {
	   //System.out.println("Hello Test NG");
	   //Reporter.log("Hello Test NG");//text message will display in testNG report
	   Reporter.log("Hello Test NG",true);
   }
   @Test
   public void demoTest1()
   {
	   Reporter.log("Welcome to marven");
   }
}
