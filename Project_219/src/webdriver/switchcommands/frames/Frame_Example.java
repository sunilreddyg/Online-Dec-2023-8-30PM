package qa.webdriver.switchcommands.frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Example {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://support.orangehrm.com/portal/en/signin");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    Thread.sleep(5000);
	    driver.switchTo().frame("iamFrame");
	    WebElement Email=driver.findElement(By.xpath("//input[@name='username']"));
	    Email.sendKeys("info@admin");

	}

}
