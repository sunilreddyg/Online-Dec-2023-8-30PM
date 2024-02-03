package ui_Verification_Commands;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {

	public static void main(String[] args) 
	{
		
		
		WebDriver driver = null;
		try {
			driver=new ChromeDriver();
			System.out.println("Browser is UP");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
		
		if(driver!=null)
		{
			
				try {
					driver.get("http://facebook.com");
					System.out.println("Page load successfull");
				} catch (SessionNotCreatedException e) {
					e.printStackTrace();
					System.out.println("Browser version is mismatched");
				} catch (InvalidArgumentException e) {
					e.printStackTrace();
					System.out.println("invalid url format");
				}
				
				//Verify expected title presented at webpage
				if(driver.getTitle().contains("Facebook"))
				{
					System.out.println("Expected Page displayed");
				}
				else
				{
					System.out.println("Title mismatch");
				}
					
				
			
		}
		else
		{
			System.out.println("Browser launch Failed");
		}
		

	}

}
