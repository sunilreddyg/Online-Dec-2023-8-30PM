package qa.webdriver.editbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example_Sendkeys {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\browserdrivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Clicking on Create new account button
		driver.findElement(By.xpath("//a[contains(.,'Create new account')]")).click();

		//Enter first name
		driver.findElement(By.name("firstname")).sendKeys("Sunil");
		
		
		driver.findElement(By.name("firstname"))
		.sendKeys(Keys.TAB+"Reddy"+Keys.TAB+"sunil@gmail.com");
		
		
		
	}

}
