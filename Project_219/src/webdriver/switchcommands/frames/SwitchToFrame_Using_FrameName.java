package qa.webdriver.switchcommands.frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame_Using_FrameName {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://support.orangehrm.com/portal/en/signin");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    Thread.sleep(5000);
	    
	    //Switch to frame using frame ID/Name property
	    driver.switchTo().frame("iamFrame");
	    
	    //Identifying elements under frame
	    WebElement Email=driver.findElement(By.xpath("//input[@name='username']"));
	    Email.sendKeys("info@admin");
	    
	    WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
	    password.sendKeys("Hello@123");
	    
	    //Switch controls back to webpage
	    driver.switchTo().defaultContent();
	    
	    WebElement Home=driver.findElement(By.xpath("//a[contains(@data-id,'0')]"));
	    Home.click();
	    
	    
	    

	}

}
