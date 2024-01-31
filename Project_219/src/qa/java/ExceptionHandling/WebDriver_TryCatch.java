package qa.java.ExceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_TryCatch {

	public static void main(String[] args) 
	{
		
		
		WebDriver driver=null;
		try {
			System.setProperty("webdriver.gecko.driver", "E:\\browserdrivers\\chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("Browser is up");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		if(driver!=null)
		{
			try {
				driver.get("http://facebook.com");
				System.out.println("Page load done");
				
				
				try {
					driver.findElement(By.id("email")).sendKeys("admin");
					System.out.println("Element found");
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
