package qa.webdriver.editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver", "E:\\browserdrivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("email")).sendKeys("user1");
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("user2");

	}

}
