package qa.webdriver.interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown_and_keyUpActions {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/selectable/default.html");
		driver.manage().window().maximize();
		
		
		//Press Control DOWN
		new Actions(driver).keyDown(Keys.CONTROL).perform();
	
		
		driver.findElement(By.xpath("//li[contains(.,'Item 1')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[contains(.,'Item 3')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[contains(.,'Item 5')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[contains(.,'Item 7')]")).click();

		
		//Release Control Key
		new Actions(driver).keyUp(Keys.CONTROL).perform();
		
	}

}
