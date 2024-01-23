package qa.webdriver.switchcommands.frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame_With_WebElement {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.redbus.in/info/redcare");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    //Switch to frame using webelement reference
	    WebElement FrameEle=driver.findElement(By.xpath("//iframe[@src='//www.redbus.in/help?hideLayout=true']"));
	    driver.switchTo().frame(FrameEle);
	    
	    WebElement Busticket=driver.findElement(By.xpath("//img[contains(@alt,'Bus Tickets')]"));
	    Busticket.click();
	    
	    WebElement TicketBooking=driver.findElement(By.xpath("//span[contains(.,'Ticket Booking')]"));
	    TicketBooking.click();
	    
	    
	    //Get Control back to mainpage from frame
	    driver.switchTo().defaultContent();
	    
	    
	    WebElement Cabrental=driver.findElement(By.xpath("//img[@alt='Online Cab Booking']"));
	    Cabrental.click();
	    
	    
	    
	    
	    
	    
	    

	    
	}

}
