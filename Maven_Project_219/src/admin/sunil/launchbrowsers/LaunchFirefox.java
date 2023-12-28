package launchbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox 
{

	public static void main(String[] args) {
		
		//Set the property only when selenium version lower than4.5
		System.setProperty("webdriver.gecko.driver", "E:\\browserdrivers\\geckodriver.exe");
		
		//Launching firefox browser
		FirefoxDriver firefox=new FirefoxDriver();
		
		//loading webpage to automation browser window
		firefox.get("http://instagram.com");
		

	}

}
