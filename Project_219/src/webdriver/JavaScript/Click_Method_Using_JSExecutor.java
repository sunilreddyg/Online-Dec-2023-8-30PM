package qa.webdriver.JavaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Method_Using_JSExecutor {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enable javascript on automation browser
		WebElement CreateNewAccount=driver.findElement(By.xpath("//u[contains(.,'Create a new account')]"));
		
		//Default method to perform left click
		//SignInbutton.click();
		
		//Click Using Mouse interactions class
		//new Actions(driver).click(SignInbutton).perform();
		
		//Enable javascript executor at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//Performing left click action at selected object using javascript
		js.executeScript("arguments[0].click()", CreateNewAccount);
		
	}

}
