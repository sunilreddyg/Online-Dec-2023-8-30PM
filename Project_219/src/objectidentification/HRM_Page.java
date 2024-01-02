package objectidentification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRM_Page {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "E:\\browserdrivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();   //Optional
		
		//Set timeout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		
		

	}

}
