package ui_Verification_Commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageSource {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "E:\\browserdrivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		
		if(PageSource.contains("username"))
		{
			driver.findElement(By.name("username")).sendKeys("Admin");
		}
		else
		{
			System.out.println("Username not presented at source");
		}
		

	}

}
