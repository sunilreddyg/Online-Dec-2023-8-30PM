package qa.webdriver.editbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keyboard_keys {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\browserdrivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.live.com/login.srf?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Sendkeys allowed to pass character sequences and Keyboard shortcut
		driver.findElement(By.id("i0116"))
		.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		
		Thread.sleep(4000);   //Static java timeout [Hold execution for 4 seconds]
		
		driver.findElement(By.id("i0118")).sendKeys("Hello@123"+Keys.ENTER);
	}

}
