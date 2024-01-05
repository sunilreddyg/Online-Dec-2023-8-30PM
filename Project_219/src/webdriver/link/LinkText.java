package qa.webdriver.link;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\browserdrivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Identify <a> anchor tagelement using Linktext identifier
		driver.findElement(By.linkText("Locations")).click();
		
		//Identify <a> anchor tagelement using Linktext identifier
		driver.findElement(By.linkText("India")).click();
		
		//Identify <a> anchor tagelement using Linktext identifier
		driver.findElement(By.linkText("FortArea")).click();
		
		//Identify <a> anchor tagelement using PartialLinktext identifier
		driver.findElement(By.partialLinkText("Siwaji Mahraj Turminas")).click();
		

	}

}
