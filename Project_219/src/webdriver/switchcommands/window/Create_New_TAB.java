package qa.webdriver.switchcommands.window;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_New_TAB {

	public static void main(String[] args) throws Exception {
		
		//only seleniu 4 version had this feature.
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    //Get First window ID
	    String firstwindowid=driver.getTitle();
	    
	    WebDriver helpwindow=driver.switchTo().newWindow(WindowType.TAB);
	    helpwindow.get("https://help.instagram.com/");
	    helpwindow.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    System.out.println(helpwindow.getTitle());
	    Thread.sleep(5000);
	    
	    //Get Next window ID
	    String secondwidnowid=helpwindow.getWindowHandle();
	    
	    helpwindow.switchTo().window(firstwindowid);
	    System.out.println(driver.getTitle());
	    
	    
	    driver.switchTo().window(secondwidnowid);
	    System.out.println(helpwindow.getTitle());

	}

}
