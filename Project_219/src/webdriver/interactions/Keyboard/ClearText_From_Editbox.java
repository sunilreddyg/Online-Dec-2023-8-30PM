package qa.webdriver.interactions.Keyboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClearText_From_Editbox {

	public static void main(String[] args) throws Exception 
	{
		
	   System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.irctc.co.in/nget/train-search");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	   //Performing keyboard shortcuts on selected location.
	   WebElement Date=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	   new Actions(driver).click(Date).keyDown(Keys.CONTROL).sendKeys("A")
	   .pause(2000).sendKeys(Keys.BACK_SPACE).perform();
	   
	   	//Select date
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//a[contains(.,'31')]")).click();
	   

	}

}
