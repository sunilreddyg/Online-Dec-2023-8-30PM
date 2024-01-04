package qa.webdriver.editbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example_Sendkeys {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\browserdrivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Clicking on Create new account button
		driver.findElement(By.xpath("//a[contains(.,'Create new account')]")).click();

		
		driver.findElement(By.name("firstname"))
		.sendKeys("Rahul"+Keys.TAB+"Shetty"+Keys.TAB+"9030248855"+Keys.TAB+"Hello");
		
		//Using keybaord shortcut select dropdown options
		driver.findElement(By.id("day")).sendKeys("25");
	
		//Using keybaord shortcut keys selecting dropdown options
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		//Note:--> Only multiple keybaord shortcut to use we should follow cama
		
		//Selecting Year dropdown option
		driver.findElement(By.id("month")).sendKeys("1980");
		
		
		//Selecting radio button using space bar [Keyboard]
		driver.findElement(By.xpath("//input[@value='1']")).sendKeys(Keys.SPACE);
		
	}

}
