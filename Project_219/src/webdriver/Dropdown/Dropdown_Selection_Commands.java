package qa.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import qa.java.methods.MethodTypes.SelectBook;

public class Dropdown_Selection_Commands 
{
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "E:\\browserdrivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		
		
		
		
		WebElement DOB_Day=driver.findElement(By.id("day"));
		
		DOB_Day.sendKeys("5");    //On Failures sendkeys doesn't throw error
		System.out.println("Day Option selected");
		
		//It throws errorn when option not found at dropdown..
		new Select(DOB_Day).selectByVisibleText("18");
		System.out.println("Option is selected succesful");
		
		//target month locator
		WebElement DOB_month=driver.findElement(By.id("month"));
		new Select(DOB_month).selectByValue("10");
		
		
		//Target year locator
		WebElement DOB_year=driver.findElement(By.id("year"));
		new Select(DOB_year).selectByIndex(5);
	}

}
