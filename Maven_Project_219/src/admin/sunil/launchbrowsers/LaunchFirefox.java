package launchbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		//Launching firefox browser
		FirefoxDriver firefox=new FirefoxDriver();
		
		//loading webpage to automation browser window
		firefox.get("http://instagram.com");
		

	}

}
