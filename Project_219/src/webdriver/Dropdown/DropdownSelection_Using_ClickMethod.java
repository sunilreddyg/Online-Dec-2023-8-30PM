package qa.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownSelection_Using_ClickMethod {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "E:\\browserdrivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		
		//Latest selenium IDE is supporting this option to select dropdown option
		WebElement DOB_Day=driver.findElement(By.id("day"));
		DOB_Day.findElement(By.xpath("//option[@value='7'][contains(.,'7')]")).click();

		
		WebElement DOB_month=driver.findElement(By.id("month"));
		DOB_month.findElement(By.xpath("//option[@value='6'][contains(.,'Jun')]")).click();
	}

}
