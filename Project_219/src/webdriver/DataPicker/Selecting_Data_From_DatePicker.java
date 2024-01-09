package qa.webdriver.DataPicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selecting_Data_From_DatePicker 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\browserdrivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement Calendar=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		Calendar.click();  //It opens calendar
		Thread.sleep(1000);
		
		WebElement Date=driver.findElement(By.xpath("//a[contains(.,'21')]"));
		Date.click();   //It select date from calendar
		
		Thread.sleep(5000);
		Calendar.clear();
		Calendar.sendKeys("24/04/2024");
		//Note:--> You can type when textbox is in writable mode..
		
		
		
	}

}
