package qa.webdriver.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_Javascript_TypingText_into_Editbox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Using Selenium Method Type text into editbox
		//driver.findElement(By.id("email")).sendKeys("Darshan");
		
		//Using Keybord Interactions class typing text into Editbox
		WebElement Password=driver.findElement(By.id("pass"));
		new Actions(driver).sendKeys(Password, "Admin").perform();
		
		
		//Using Javascript Executor Run Javascript on Automatio browser..
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('email').value='darshan'");
		
		//Javascript Executor using Xpath  [Performing left click action]
		WebElement LoginButton=driver.findElement(By.xpath("//button[contains(@data-testid,'royal_login_button')]"));
		((JavascriptExecutor)driver)
		.executeScript("arguments[0].click()", LoginButton);
		
		

	}

}
