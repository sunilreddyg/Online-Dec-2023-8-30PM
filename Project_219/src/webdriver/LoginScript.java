package qa.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginScript {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\browserdrivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();   //Optional
		
		driver.findElement(By.id("email")).sendKeys("darshan");
		driver.findElement(By.id("pass")).sendKeys("Hello");
		driver.findElement(By.name("login")).click();
	}

}
