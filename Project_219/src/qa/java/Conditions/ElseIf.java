package qa.java.Conditions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElseIf {

	public static void main(String[] args) 
	{
	
		
		/*
		 * elseif:-->
		 * 			multi decision statemenet
		 */
		
		String browser="firefox";
		
		if(browser.equals("chrome"))
		{
			System.out.println("Chrome is UP");
		}
		else if(browser.equals("firefox"))
		{
			System.out.println("firefox is up");
		}
		else if(browser.equals("ie"))
		{
			System.out.println("IE is up");
		}
		else
		{
			System.out.println("No browser is up");
		}
		
		
		
		//CrossBrowser test
		String br="firefox";
		WebDriver driver=null;
		String browserpath="E:\\browserdrivers\\";
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", browserpath+"chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", browserpath+"geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("browser mismatch");
		}
		
		
		//loading webpage
		driver.get("http://facebook.com");
		
		
		
		

	}

}
