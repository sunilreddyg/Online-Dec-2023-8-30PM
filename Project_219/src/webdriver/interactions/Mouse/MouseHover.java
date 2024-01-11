package qa.webdriver.interactions.Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\browserdrivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Perform Mouse hover action at selected location
		WebElement JobsMenu=driver.findElement(By.xpath("//a[@title='Search Jobs']"));
		new Actions(driver).moveToElement(JobsMenu).perform();
		//This action will hover on selected locations
		
		WebElement RemoteJobs=driver.findElement(By.xpath("(//div[contains(.,'Remote jobs')])[5]"));
		new Actions(driver).click(RemoteJobs).perform();
		//Using Mouse interactions class performing Mouse left click
	}

}
