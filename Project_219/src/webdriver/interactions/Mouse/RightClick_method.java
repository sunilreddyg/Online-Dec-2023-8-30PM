package qa.webdriver.interactions.Mouse;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_method {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//Use Mouse Right click at location
		WebElement Element=driver.findElement(By.xpath("//span[contains(.,'right click me')]"));
		new Actions(driver).contextClick(Element).perform();
		
		Thread.sleep(4000);
		
		//Use Mouse Click action
		WebElement Delete=driver.findElement(By.xpath("//li[contains(.,'Delete')]"));
		//Delete.click();
		new Actions(driver).click(Delete).perform();
		
		
		/*
		 * Note:--> In Any website WebElement Class Click() method is not working
		 * 			so that we can try  Actions class  click() method/
		 */
		

	}

}
