package qa.webdriver.interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_With_Element {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		
		WebElement Firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		new Actions(driver).sendKeys(Firstname, "Rahul").pause(1000)
		.sendKeys(Keys.TAB).pause(2000).sendKeys("Shetty").perform();

	}

}
