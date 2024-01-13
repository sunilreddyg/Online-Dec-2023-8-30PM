package qa.webdriver.interactions.Keyboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Keys {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(8000);
		
		
		WebElement FromLabel=driver.findElement(By.xpath("//span[contains(.,'From')]"));
		new Actions(driver).click(FromLabel).pause(2000).sendKeys("DEL")
		.pause(3000).sendKeys(Keys.ARROW_DOWN).pause(1000).sendKeys(Keys.ENTER).perform();

	}

}
