package launchbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) 
	{
		
		/*
		 * Downloading chromedriver.exe file..
		 * 
		 * => URL:--> https://chromedriver.chromium.org/downloads
		 * => Click on Stable version according to your chrome version
		 */
		
		
		//Setting runtime environment variable for chrome driver
		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
		
		//Launching automation chrome instance
		ChromeDriver chrome=new ChromeDriver();

		//Using Chromedriver reference loading page to automation browser window
		chrome.get("https://facebook.com");
		
		//Print page title
		System.out.println(chrome.getTitle());
		
		//Close automation browser
		chrome.quit();
	}

}
