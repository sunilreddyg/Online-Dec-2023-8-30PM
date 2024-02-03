package ui_Verification_Commands;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page_Verification_Commands {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "E:\\browserdrivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		
		//Get current window title
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		
		//Get Current Window url
		String Pageurl=driver.getCurrentUrl();
		System.out.println(Pageurl);
		
		//Get Current Page Source
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		
		driver.quit();
		

	}

}
