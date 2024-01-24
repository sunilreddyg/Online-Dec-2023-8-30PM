package qa.webdriver.switchcommands.window;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    
	    //Get window handler
	    String Firstwindow=driver.getWindowHandle();
	    System.out.println(Firstwindow);
	    
	    WebElement Help=driver.findElement(By.xpath("//span[contains(.,'Help')]"));
	    Help.click();
	    System.out.println("Before Switch --> "+driver.getTitle());
	    
	    
	    //Get All window Handlers
	    Set<String> allwindowsids=driver.getWindowHandles();
	    
	    //Convert collection value into iterators
	    Iterator<String> itr=allwindowsids.iterator();
	    
	    //Read Each Iterator value using next keyword
	    String Window1=itr.next();
	    String window2=itr.next();
	    
	    //Switch to Second window
	    driver.switchTo().window(window2);
	    System.out.println("After switch--> "+driver.getTitle());
	    
	    
	    WebElement Reels=driver.findElement(By.xpath("//a[contains(.,'Reels')]"));
	    Reels.click();
	    
	    
	    //Switch back to first window
	    driver.switchTo().window(Firstwindow);
	    //driver.switchTo().window(Window1);
	    
	    WebElement Signup=driver.findElement(By.xpath("(//span[contains(.,'Sign up')])[2]"));
	    Signup.click();
	    
	    
	    
	}

}
