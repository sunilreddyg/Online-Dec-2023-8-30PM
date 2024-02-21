package framework.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InvaCation_Count

{
	
  @Test(invocationCount=10)
  public void test() 
  {
	  System.out.println("Test Executed");
  }
  
  
  
  int count=0;
  @Test(invocationCount = 5)
  public void selectmonth()
  {
	  WebElement month=driver.findElement(By.id("month"));
	  new Select(month).selectByIndex(count);
	  count=count+1;
  }
  
  
  WebDriver driver;
  @BeforeClass
  public void PreCondition()
  {
	   System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://facebook.com/reg");
	   
  }
  
  
}
