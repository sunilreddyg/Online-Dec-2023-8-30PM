package qa.webdriver.List;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selecting_listof_items {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.gecko.driver", "E:\\browserdrivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://hdfcbank.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		
		//Step1:--> Click Mouse action to open list of items
		driver.findElement(By.linkText("Select Product Type")).click();
		
		//Step2:--> Click one of option from list using click method
		driver.findElement(By.xpath("(//li[@value='1'])[1]")).click();
		

		//Step1:
		driver.findElement(By.linkText("Select Product")).click();
		//Step2
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@value='2'][contains(.,'Debit Cards')]")).click();

		
		
	}

}
