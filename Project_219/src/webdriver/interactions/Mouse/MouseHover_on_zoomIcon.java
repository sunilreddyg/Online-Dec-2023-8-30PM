package qa.webdriver.interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_on_zoomIcon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/zoom/image-magnifier-on-hover.html");
		driver.manage().window().maximize();
		
		
		//Move Cursor at Required location and press Mouse on it..
		WebElement Image=driver.findElement(By.xpath("//a[@title='Magnify Images On Hover Or Touch & Hold - jQuery izoomify']"));
		new Actions(driver).moveToElement(Image).pause(1000).click().perform();
		
		

	}

}
