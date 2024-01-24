package qa.webdriver.switchcommands.window;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_RequriedWIndow_using_title {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    
	    //Get window handler
	    String Firstwindow=driver.getWindowHandle();
	    System.out.println(Firstwindow);
	    
	    //This link open webpage at NEW TAB/NEW Window
	    WebElement Help=driver.findElement(By.xpath("//span[contains(.,'Help')]"));
	    Help.click();
	    System.out.println("Before Switch --> "+driver.getTitle());
	    
	    //This link open webpage at NEW TAB/NEW Window
	    WebElement Meta=driver.findElement(By.xpath("(//span[contains(.,'Meta')])[1]"));
	    Meta.click();
	    
	    
	    //Get All window Handlers
	    Set<String> allwindowsids=driver.getWindowHandles();
	    
	    //Release Each window in random order
	    for (String eachwindowid : allwindowsids) 
	    {
	    	//switching to window using window handler
			driver.switchTo().window(eachwindowid);
			//Read Each window title
			String title=driver.getTitle();
			System.out.println(title);
			
			if(title.contains("Instagram"))
			{
				break;
			}
			
		}
	    
	    
	    System.out.println("Active window is -->"+driver.getTitle());
	    

	}

}
